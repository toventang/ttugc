package com.p2082ss.android.ugc.aweme.publish.core.upload;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.AbstractC30093n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.core.upload.c */
public final class C65522c implements AbstractC30093n {

    /* renamed from: a */
    public static final C65523a f147756a = new C65523a((byte) 0);

    /* renamed from: b */
    private final SmartSliceModel f147757b;

    static {
        Covode.recordClassIndex(77012);
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30093n
    /* renamed from: c */
    public final boolean mo53469c() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.upload.c$a */
    public static final class C65523a {
        static {
            Covode.recordClassIndex(77013);
        }

        private C65523a() {
        }

        public /* synthetic */ C65523a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30093n
    /* renamed from: a */
    public final String mo53467a() {
        return this.f147757b.getPackageUrl();
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30093n
    /* renamed from: b */
    public final String mo53468b() {
        String scene = this.f147757b.getScene();
        if (scene.length() == 0) {
            return "default";
        }
        return scene;
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30093n
    /* renamed from: d */
    public final String mo53470d() {
        if (this.f147757b.getType() != 2 && this.f147757b.getType() == 3) {
            return "bytenn";
        }
        return "tflite";
    }

    public C65522c(SmartSliceModel smartSliceModel) {
        C89219l.m154721d(smartSliceModel, "");
        this.f147757b = smartSliceModel;
    }
}
