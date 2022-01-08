    public static void addlist(javax.swing.JList list, String s)
    {
        javax.swing.DefaultListModel wq = new javax.swing.DefaultListModel();
        for (int i = 0; i < list.getModel().getSize();)
        {
            list.setSelectedIndex(i);
            wq.addElement(list.getSelectedValue());
            i = i + 1;
        }
        wq.addElement(s);
        list.setModel(wq);
    }
    public static void addalist(javax.swing.JList list, String[] s)
    {
        javax.swing.DefaultListModel wq = new javax.swing.DefaultListModel();
        for (int i = 0; i < list.getModel().getSize();)
        {
            list.setSelectedIndex(i);
            wq.addElement(list.getSelectedValue());
            i = i + 1;
        }
        for (int x = 0; x < s.length;)
        {
        wq.addElement(s[x]);
        x = x + 1;
        }
        list.setModel(wq);
    }
