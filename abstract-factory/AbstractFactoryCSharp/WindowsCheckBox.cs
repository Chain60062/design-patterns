class WindowsCheckBox : CheckBox
{
    public bool Checked { get; set; }

    public WindowsCheckBox()
    {
        Checked = false;
    }
    public bool IsChecked() => Checked;
    public void Check() => Checked = true;
}