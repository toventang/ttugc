package com.lynx.tasm.base;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.TemplateData;

/* renamed from: com.lynx.tasm.base.i */
public class C28460i {

    /* renamed from: a */
    public String f66925a;

    /* renamed from: b */
    public boolean f66926b;

    /* renamed from: c */
    public boolean f66927c;

    /* renamed from: d */
    public C28461a f66928d = new C28461a(this, (byte) 0);

    /* renamed from: e */
    private LynxTemplateRender f66929e;

    /* renamed from: f */
    private C28462b f66930f = new C28462b(this, (byte) 0);

    static {
        Covode.recordClassIndex(34456);
    }

    /* renamed from: com.lynx.tasm.base.i$a */
    public class C28461a {

        /* renamed from: a */
        public byte[] f66931a;

        /* renamed from: b */
        public String f66932b;

        /* renamed from: c */
        public TemplateData f66933c;

        static {
            Covode.recordClassIndex(34457);
        }

        private C28461a() {
        }

        /* synthetic */ C28461a(C28460i iVar, byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.base.i$b */
    public class C28462b {

        /* renamed from: a */
        public String f66935a;

        /* renamed from: b */
        public TemplateData f66936b;

        static {
            Covode.recordClassIndex(34458);
        }

        private C28462b() {
        }

        /* synthetic */ C28462b(C28460i iVar, byte b) {
            this();
        }
    }

    public C28460i(LynxTemplateRender lynxTemplateRender) {
        this.f66929e = lynxTemplateRender;
    }

    /* renamed from: a */
    public final void mo48916a(String str, TemplateData templateData) {
        this.f66926b = false;
        this.f66927c = true;
        this.f66930f.f66935a = str;
        this.f66930f.f66936b = templateData;
        this.f66925a = str;
    }
}
