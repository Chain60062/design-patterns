class MacCheckBox : CheckBox
{
    public bool Checked { get; set; }

    public MacCheckBox()
    {
        Checked = false;
    }
    public void Check() => Checked = true;
    public bool IsChecked() => Checked;
}