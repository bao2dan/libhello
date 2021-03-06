// Java Package hi is a proxy for talking to a Go program.
//
// File is generated by gobind. Do not edit.
package go.hi;

import go.Seq;

public abstract class Hi {
    private Hi() {
    } // uninstantiable

    public static String Hello(String name) {
        go.Seq _in = new go.Seq();
        go.Seq _out = new go.Seq();
        _in.writeUTF16(name);
        Seq.send(DESCRIPTOR, CALL_Hello, _in, _out);
        return _out.readUTF16();
    }

    private static final int CALL_Hello = 1;
    private static final String DESCRIPTOR = "hi";
}
