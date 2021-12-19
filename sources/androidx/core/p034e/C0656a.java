package androidx.core.p034e;

import android.util.Base64;
import androidx.core.p036g.C0697g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: androidx.core.e.a */
public final class C0656a {

    /* renamed from: a */
    public final String f2654a;

    /* renamed from: b */
    public final String f2655b;

    /* renamed from: c */
    public final String f2656c;

    /* renamed from: d */
    public final List<List<byte[]>> f2657d;

    /* renamed from: e */
    public final int f2658e;

    /* renamed from: f */
    public final String f2659f;

    static {
        Covode.recordClassIndex(735);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2654a + ", mProviderPackage: " + this.f2655b + ", mQuery: " + this.f2656c + ", mCertificates:");
        for (int i = 0; i < this.f2657d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f2657d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2658e);
        return sb.toString();
    }

    public C0656a(String str, String str2, String str3) {
        String str4 = (String) C0697g.m2452a(str);
        this.f2654a = str4;
        String str5 = (String) C0697g.m2452a(str2);
        this.f2655b = str5;
        String str6 = (String) C0697g.m2452a(str3);
        this.f2656c = str6;
        this.f2657d = null;
        this.f2658e = R.array.l;
        this.f2659f = str4 + "-" + str5 + "-" + str6;
    }

    public C0656a(String str, String str2, String str3, List<List<byte[]>> list) {
        String str4 = (String) C0697g.m2452a(str);
        this.f2654a = str4;
        String str5 = (String) C0697g.m2452a(str2);
        this.f2655b = str5;
        String str6 = (String) C0697g.m2452a(str3);
        this.f2656c = str6;
        this.f2657d = (List) C0697g.m2452a(list);
        this.f2658e = 0;
        this.f2659f = str4 + "-" + str5 + "-" + str6;
    }
}
