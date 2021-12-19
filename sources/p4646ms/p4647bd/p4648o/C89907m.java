package p4646ms.p4647bd.p4648o;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: ms.bd.o.m */
public class C89907m extends RuntimeException {
    static {
        Covode.recordClassIndex(106004);
    }

    public C89907m(String str, String[] strArr, String[] strArr2) {
        super("Could not find '" + str + "'. Looked for: " + Arrays.toString(strArr) + ", but only found: " + Arrays.toString(strArr2) + ".");
    }
}
