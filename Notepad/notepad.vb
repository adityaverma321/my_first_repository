Public Class Notepad

    
    Private Sub AboutToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles AboutToolStripMenuItem.Click
        MessageBox.Show("Simple Notepad created by Aditya. Use it at your own RISK!", "About NotePad")
    End Sub

    
    Private Sub SaveToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles SaveToolStripMenuItem.Click
        Dim Save As New SaveFileDialog()
        Dim myStreamWriter As System.IO.StreamWriter
        Save.Filter = "Text [*.txt*]|*.txt|All Files [*.*]|*.*"
        Save.CheckPathExists = True
        Save.Title = "Save File"
        Save.ShowDialog(Me)
        Try
            myStreamWriter = System.IO.File.AppendText(Save.FileName)
            myStreamWriter.Write(RichTextBox1.Text)
            myStreamWriter.Flush()
        Catch ex As Exception
        End Try
    End Sub

    Private Sub NewToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles NewToolStripMenuItem.Click
        Dim Save As New SaveFileDialog()
        Dim myStreamWriter As System.IO.StreamWriter
        'Check if there's text added to the textbox
        If RichTextBox1.Modified Then
            'If the text of notepad changed, the program will ask the user if they want to save the changes
            Dim ask As MsgBoxResult
            ask = MsgBox("Do you want to save the changes", MsgBoxStyle.YesNo, "New Document")
            If ask = MsgBoxResult.Yes Then

                Save.Filter = "Text [*.txt*]|*.txt|All Files [*.*]|*.*"
                Save.CheckPathExists = True
                Save.Title = "Save File"
                Save.ShowDialog(Me)
                Try
                    myStreamWriter = System.IO.File.AppendText(Save.FileName)
                    myStreamWriter.Write(RichTextBox1.Text)
                    myStreamWriter.Flush()
                Catch ex As Exception
                End Try
            End If
            'If textbox's text is still the same, notepad will open a new page:
        Else
            RichTextBox1.Clear()
        End If
    End Sub

    Private Sub Notepad_FormClosing(sender As Object, e As EventArgs) Handles MyBase.FormClosing
        Dim Save As New SaveFileDialog()
        Dim myStreamWriter As System.IO.StreamWriter
        'Check if there's text added to the textbox
        If RichTextBox1.Modified Then
            'If the text of notepad changed, the program will ask the user if they want to save the changes
            Dim ask As MsgBoxResult
            ask = MsgBox("Do you want to save the changes", MsgBoxStyle.YesNoCancel, "New Document")
            If ask = MsgBoxResult.Yes Then

                Save.Filter = "Text [*.txt*]|*.txt|All Files [*.*]|*.*"
                Save.CheckPathExists = True
                Save.Title = "Save File"
                Save.ShowDialog(Me)
                Try
                    myStreamWriter = System.IO.File.AppendText(Save.FileName)
                    myStreamWriter.Write(RichTextBox1.Text)
                    myStreamWriter.Flush()
                Catch ex As Exception
                End Try
            ElseIf ask = MsgBoxResult.Cancel Then


            End If

            'If textbox's text is still the same, notepad will open a new page:
        Else
            RichTextBox1.Clear()
        End If
    End Sub

    
    Private Sub ExitToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ExitToolStripMenuItem.Click
        Me.Close()

    End Sub
End Class
