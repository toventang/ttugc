package p4646ms.p4647bd.p4648o;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: ms.bd.o.g */
public final class C89886g {
    static {
        Covode.recordClassIndex(105983);
    }

    /* renamed from: a */
    static boolean m155963a(Context context, String str, String str2) {
        int i;
        MethodCollector.m26663i(2728);
        boolean z = true;
        try {
            String[] list = context.getAssets().list(str);
            if (list.length > 0) {
                new File(str2).mkdirs();
                for (String str3 : list) {
                    m155963a(context, str + ((String) C89889h.m155966a(16777217, 0, 0, "42ea31", new byte[]{106})) + str3, str2 + ((String) C89889h.m155966a(16777217, 0, 0, "c40b78", new byte[]{61})) + str3);
                }
            } else {
                InputStream open = context.getAssets().open(str);
                FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = open.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.flush();
                open.close();
                fileOutputStream.close();
            }
            i = 2728;
        } catch (Exception unused) {
            C89889h.m155966a(16777217, 0, 0, "f97e49", new byte[]{116, 58, 66});
            i = 2728;
            z = false;
        }
        MethodCollector.m26664o(i);
        return z;
    }
}
