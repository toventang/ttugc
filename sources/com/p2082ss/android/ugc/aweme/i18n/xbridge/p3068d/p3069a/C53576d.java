package com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d.p3069a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18423d;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18424e;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53515a;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53516b;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d.C53557a;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.utils.permission.C80620e;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p078c.p080b.C1757e;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.d */
public final class C53576d implements AbstractC53515a {

    /* renamed from: e */
    public static final C53577a f122979e = new C53577a((byte) 0);

    /* renamed from: a */
    final WeakReference<Activity> f122980a;

    /* renamed from: b */
    public final AbstractC53516b f122981b;

    /* renamed from: c */
    boolean f122982c;

    /* renamed from: d */
    String f122983d;

    static {
        Covode.recordClassIndex(63152);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.d$a */
    public static final class C53577a {
        static {
            Covode.recordClassIndex(63153);
        }

        private C53577a() {
        }

        public /* synthetic */ C53577a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.d$b */
    static final class C53578b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53576d f122984a;

        /* renamed from: b */
        final /* synthetic */ C18423d f122985b;

        static {
            Covode.recordClassIndex(63154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53578b(C53576d dVar, C18423d dVar2) {
            super(0);
            this.f122984a = dVar;
            this.f122985b = dVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Uri a;
            C53576d dVar = this.f122984a;
            String str = this.f122985b.f44022j;
            Activity activity = dVar.f122980a.get();
            if (activity == null) {
                dVar.f122981b.mo90106a(0, "Activity obtained is null");
            } else {
                Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                if (C89219l.m154714a((Object) str, (Object) "front")) {
                    intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                    intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                    intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                    intent.putExtra("default_camera", "1");
                    intent.putExtra("default_mode", "com.huawei.camera2.mode.photo.PhotoMode");
                    intent.putExtra("camerafacing", "front");
                    intent.putExtra("previous_mode", "front");
                }
                String concat = "Dou_fsm_".concat(String.valueOf(new SimpleDateFormat("yyyy-MMdd_HHmmss", Locale.ENGLISH).format(new Date())));
                if (dVar.f122982c) {
                    a = C1757e.m5906b(activity, concat + ".mp4", "video/mp4");
                    C89219l.m154716b(a, "");
                } else {
                    File createTempFile = File.createTempFile(concat, ".mp4", C53557a.m98768a());
                    C89219l.m154716b(createTempFile, "");
                    dVar.f122983d = createTempFile.getAbsolutePath();
                    a = C30128d.m60943a(activity, createTempFile);
                    C89219l.m154716b(a, "");
                }
                intent.putExtra("output", a);
                activity.startActivityForResult(intent, 800);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53515a
    /* renamed from: a */
    public final void mo90104a(C18423d dVar) {
        C89219l.m154721d(dVar, "");
        this.f122982c = dVar.f44021i;
        C53578b bVar = new C53578b(this, dVar);
        C89219l.m154721d(bVar, "");
        Activity activity = this.f122980a.get();
        if (activity == null) {
            return;
        }
        if (C80620e.m139778a(activity) == 0 && C80620e.m139781c(activity) == 0) {
            bVar.invoke();
        } else {
            C35444b.m72473a(activity, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new C53579c(this, bVar));
        }
    }

    public C53576d(WeakReference<Activity> weakReference, AbstractC53516b bVar) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(bVar, "");
        this.f122980a = weakReference;
        this.f122981b = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.d$c */
    static final class C53579c implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ C53576d f122986a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f122987b;

        static {
            Covode.recordClassIndex(63155);
        }

        C53579c(C53576d dVar, AbstractC89171a aVar) {
            this.f122986a = dVar;
            this.f122987b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            if (iArr[0] == 0 && iArr[1] == 0) {
                this.f122987b.invoke();
            } else {
                this.f122986a.f122981b.mo90106a(-6, "Permission rejected");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53515a
    /* renamed from: a */
    public final boolean mo90105a(int i, int i2, Intent intent) {
        if (i == 800) {
            if (i2 == 0 || intent == null) {
                this.f122981b.mo90106a(-7, "Failed to capture video");
                return true;
            }
            Activity activity = this.f122980a.get();
            if (activity == null) {
                this.f122981b.mo90106a(0, "Activity not found");
                return true;
            }
            Uri data = intent.getData();
            if (data == null || C13627m.m24498a(data.toString())) {
                this.f122981b.mo90106a(0, "Video doesn't exist");
                return true;
            }
            String str = this.f122983d;
            if (str == null) {
                str = data.toString();
                C89219l.m154716b(str, "");
            }
            List<C18424e.C18425a> a = C89070n.m154516a(new C18424e.C18425a(str, C1757e.m5900a(activity, data), "video"));
            AbstractC53516b bVar = this.f122981b;
            C18424e eVar = new C18424e();
            eVar.f44026a = a;
            bVar.mo90107a(eVar);
        }
        return true;
    }
}
