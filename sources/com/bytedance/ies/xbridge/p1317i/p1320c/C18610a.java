package com.bytedance.ies.xbridge.p1317i.p1320c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.i.c.a */
public final class C18610a extends AbstractC18749a {

    /* renamed from: n */
    public static final C18611a f44319n = new C18611a((byte) 0);

    /* renamed from: a */
    public List<String> f44320a;

    /* renamed from: b */
    public String f44321b;

    /* renamed from: c */
    public int f44322c = 1;

    /* renamed from: d */
    public boolean f44323d;

    /* renamed from: e */
    public boolean f44324e;

    /* renamed from: f */
    public String f44325f = "";

    /* renamed from: g */
    public boolean f44326g;

    /* renamed from: h */
    public int f44327h;

    /* renamed from: i */
    public int f44328i;

    /* renamed from: j */
    public boolean f44329j;

    /* renamed from: k */
    public int f44330k;

    /* renamed from: l */
    public int f44331l;

    /* renamed from: m */
    public boolean f44332m;

    static {
        Covode.recordClassIndex(21304);
    }

    /* renamed from: com.bytedance.ies.xbridge.i.c.a$a */
    public static final class C18611a {
        static {
            Covode.recordClassIndex(21305);
        }

        private C18611a() {
        }

        public /* synthetic */ C18611a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo29686a() {
        String str = this.f44321b;
        if (str == null) {
            C89219l.m154710a("sourceType");
        }
        return str;
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154522b("mediaTypes", "sourceType", "maxCount", "compressImage", "saveToPhotoAlbum", "cameraType", "needBinaryData", "compressWidth", "compressHeight", "isNeedCut", "cropRatioWidth", "cropRatioHeight", "needBase64Data");
    }
}
