package p4550e.p4552b;

import com.bytedance.covode.number.Covode;

/* renamed from: e.b.a */
public final class C88334a implements AbstractC88335b {
    static {
        Covode.recordClassIndex(104373);
    }

    @Override // p4550e.p4552b.AbstractC88335b
    /* renamed from: a */
    public final boolean mo142853a(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!(charAt == 0 || charAt == '\t' || charAt == '\n' || charAt == '\r' || ((charAt >= ' ' && charAt <= 55295) || ((charAt >= 57344 && charAt <= 65533) || (charAt >= 0 && charAt <= 65535))))) {
                return true;
            }
        }
        return false;
    }
}
