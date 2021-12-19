package com.bytedance.ies.xbridge.p1343n.p1348d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.n.d.d */
public final class C18798d extends AbstractC18749a {

    /* renamed from: g */
    public static final C18799a f44579g = new C18799a((byte) 0);

    /* renamed from: a */
    public String f44580a;

    /* renamed from: b */
    public String f44581b;

    /* renamed from: c */
    public boolean f44582c;

    /* renamed from: d */
    public String f44583d;

    /* renamed from: e */
    public String f44584e;

    /* renamed from: f */
    public boolean f44585f;

    static {
        Covode.recordClassIndex(21494);
    }

    /* renamed from: com.bytedance.ies.xbridge.n.d.d$a */
    public static final class C18799a {
        static {
            Covode.recordClassIndex(21495);
        }

        private C18799a() {
        }

        public /* synthetic */ C18799a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo29821a() {
        String str = this.f44583d;
        if (str == null) {
            C89219l.m154710a("cancelText");
        }
        return str;
    }

    /* renamed from: b */
    public final String mo29822b() {
        String str = this.f44584e;
        if (str == null) {
            C89219l.m154710a("confirmText");
        }
        return str;
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154522b("title", "content", "showCancel", "cancelText", "confirmText", "tapMaskToDismiss");
    }
}
