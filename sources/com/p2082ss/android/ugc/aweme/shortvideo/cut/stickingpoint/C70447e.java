package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.AlertDialogC70495a;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VEListener;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e */
public final class C70447e {

    /* renamed from: k */
    public static final C70448a f157398k = new C70448a((byte) 0);

    /* renamed from: a */
    public AbstractC31071f f157399a;

    /* renamed from: b */
    int f157400b;

    /* renamed from: c */
    VideoSegment f157401c;

    /* renamed from: d */
    int f157402d;

    /* renamed from: e */
    List<? extends VideoSegment> f157403e;

    /* renamed from: f */
    AbstractC70449b f157404f;

    /* renamed from: g */
    float f157405g;

    /* renamed from: h */
    float f157406h;

    /* renamed from: i */
    final HashSet<String> f157407i = new HashSet<>();

    /* renamed from: j */
    public final HandlerC70452e f157408j = new HandlerC70452e(this, Looper.getMainLooper());

    /* renamed from: l */
    private AlertDialogC70495a f157409l;

    /* renamed from: m */
    private Activity f157410m;

    /* renamed from: n */
    private boolean f157411n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$b */
    public interface AbstractC70449b {
        static {
            Covode.recordClassIndex(82892);
        }

        /* renamed from: a */
        void mo110886a();

        /* renamed from: a */
        void mo110887a(boolean z, boolean z2, boolean z3);
    }

    static {
        Covode.recordClassIndex(82890);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$a */
    public static final class C70448a {
        static {
            Covode.recordClassIndex(82891);
        }

        private C70448a() {
        }

        public /* synthetic */ C70448a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$d */
    public static final class C70451d implements AlertDialogC70495a.AbstractC70496a {

        /* renamed from: a */
        final /* synthetic */ C70447e f157413a;

        static {
            Covode.recordClassIndex(82894);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.AlertDialogC70495a.AbstractC70496a
        /* renamed from: a */
        public final void mo111017a() {
            this.f157413a.mo111013a(false, true, false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70451d(C70447e eVar) {
            this.f157413a = eVar;
        }
    }

    /* renamed from: d */
    private final void m124251d() {
        AlertDialogC70495a aVar = this.f157409l;
        if (aVar != null && aVar.isShowing()) {
            AlertDialogC70495a aVar2 = this.f157409l;
            if (aVar2 == null) {
                C89219l.m154715b();
            }
            aVar2.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo111008a() {
        if (!this.f157411n) {
            AbstractC31071f fVar = this.f157399a;
            if (fVar == null) {
                C89219l.m154715b();
            }
            fVar.mo56262a(this.f157402d, new C70453f(this));
        }
    }

    /* renamed from: b */
    public final void mo111015b() {
        this.f157411n = true;
        AbstractC31071f fVar = this.f157399a;
        if (fVar != null) {
            fVar.mo56371k(this.f157402d);
        }
        this.f157408j.removeCallbacksAndMessages(null);
    }

    /* renamed from: c */
    private final void m124250c() {
        AlertDialogC70495a aVar;
        Activity activity = this.f157410m;
        if (activity != null && !activity.isFinishing() && (aVar = this.f157409l) != null && !aVar.isShowing()) {
            try {
                AlertDialogC70495a aVar2 = this.f157409l;
                if (aVar2 == null) {
                    C89219l.m154715b();
                }
                aVar2.show();
                mo111009a(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$c */
    public static final class DialogInterface$OnDismissListenerC70450c implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C70447e f157412a;

        static {
            Covode.recordClassIndex(82893);
        }

        DialogInterface$OnDismissListenerC70450c(C70447e eVar) {
            this.f157412a = eVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f157412a.mo111015b();
        }
    }

    /* renamed from: a */
    public final void mo111011a(AbstractC70449b bVar) {
        C89219l.m154721d(bVar, "");
        this.f157404f = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$f */
    public static final class C70453f implements VEListener.AbstractC85240i {

        /* renamed from: a */
        final /* synthetic */ C70447e f157415a;

        static {
            Covode.recordClassIndex(82896);
        }

        C70453f(C70447e eVar) {
            this.f157415a = eVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85240i
        /* renamed from: a */
        public final void mo111019a(float f) {
            Message obtain = Message.obtain();
            obtain.what = 1001;
            obtain.obj = Float.valueOf(f);
            this.f157415a.f157408j.sendMessage(obtain);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$g */
    static final class C70454g implements VEListener.AbstractC85240i {

        /* renamed from: a */
        final /* synthetic */ C70447e f157416a;

        static {
            Covode.recordClassIndex(82897);
        }

        C70454g(C70447e eVar) {
            this.f157416a = eVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85240i
        /* renamed from: a */
        public final void mo111019a(float f) {
            Message obtain = Message.obtain();
            obtain.what = 1002;
            obtain.obj = Float.valueOf(f);
            this.f157416a.f157408j.sendMessage(obtain);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo111009a(int i) {
        AlertDialogC70495a aVar = this.f157409l;
        if (aVar != null && aVar.isShowing()) {
            AlertDialogC70495a aVar2 = this.f157409l;
            if (aVar2 == null) {
                C89219l.m154715b();
            }
            aVar2.mo111075a(i);
        }
    }

    /* renamed from: a */
    public final void mo111010a(Activity activity) {
        this.f157410m = activity;
        if (activity != null && !activity.isFinishing()) {
            AlertDialogC70495a aVar = new AlertDialogC70495a(activity);
            this.f157409l = aVar;
            aVar.mo111077a(true);
            AlertDialogC70495a aVar2 = this.f157409l;
            if (aVar2 == null) {
                C89219l.m154715b();
            }
            aVar2.setCancelable(true);
            AlertDialogC70495a aVar3 = this.f157409l;
            if (aVar3 == null) {
                C89219l.m154715b();
            }
            aVar3.setMessage(activity.getResources().getString(R.string.g4p));
            AlertDialogC70495a aVar4 = this.f157409l;
            if (aVar4 == null) {
                C89219l.m154715b();
            }
            aVar4.mo111075a(0);
            AlertDialogC70495a aVar5 = this.f157409l;
            if (aVar5 == null) {
                C89219l.m154715b();
            }
            aVar5.setOnDismissListener(new DialogInterface$OnDismissListenerC70450c(this));
            AlertDialogC70495a aVar6 = this.f157409l;
            if (aVar6 == null) {
                C89219l.m154715b();
            }
            aVar6.mo111076a(new C70451d(this));
        }
    }

    /* renamed from: a */
    public final void mo111012a(List<? extends VideoSegment> list) {
        this.f157411n = false;
        AbstractC70449b bVar = this.f157404f;
        if (bVar != null) {
            bVar.mo110886a();
        }
        if (C84904k.m145909a(list)) {
            mo111013a(true, false, false);
        } else if (this.f157399a == null) {
            mo111013a(false, false, false);
        } else {
            mo111015b();
            this.f157411n = false;
            this.f157406h = 0.0f;
            if (list == null) {
                C89219l.m154715b();
            }
            this.f157405g = 1.0f / ((float) list.size());
            this.f157400b = 0;
            this.f157403e = list;
            VideoSegment videoSegment = (VideoSegment) list.get(0);
            this.f157401c = videoSegment;
            if (videoSegment == null) {
                C89219l.m154715b();
            }
            this.f157402d = videoSegment.f156709a;
            m124250c();
            mo111008a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$e */
    public static final class HandlerC70452e extends Handler {

        /* renamed from: a */
        final /* synthetic */ C70447e f157414a;

        static {
            Covode.recordClassIndex(82895);
        }

        public final void handleMessage(Message message) {
            C89219l.m154721d(message, "");
            if (message.what == 1001) {
                C70447e eVar = this.f157414a;
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) obj).floatValue();
                if (floatValue >= 1.0f) {
                    if (eVar.f157401c != null) {
                        VideoSegment videoSegment = eVar.f157401c;
                        if (videoSegment == null) {
                            C89219l.m154715b();
                        }
                        videoSegment.f156724p = true;
                        HashSet<String> hashSet = eVar.f157407i;
                        VideoSegment videoSegment2 = eVar.f157401c;
                        if (videoSegment2 == null) {
                            C89219l.m154715b();
                        }
                        hashSet.add(videoSegment2.mo110571a(false).toString());
                    }
                    eVar.f157400b++;
                    eVar.f157406h = eVar.f157405g * ((float) eVar.f157400b);
                    int i = eVar.f157400b;
                    List<? extends VideoSegment> list = eVar.f157403e;
                    if (list == null) {
                        C89219l.m154715b();
                    }
                    if (i >= list.size()) {
                        eVar.mo111013a(true, false, true);
                        return;
                    }
                    List<? extends VideoSegment> list2 = eVar.f157403e;
                    if (list2 == null) {
                        C89219l.m154715b();
                    }
                    eVar.f157401c = (VideoSegment) list2.get(eVar.f157400b);
                    if (eVar.f157401c == null) {
                        eVar.mo111013a(false, false, false);
                        return;
                    }
                    VideoSegment videoSegment3 = eVar.f157401c;
                    if (videoSegment3 == null) {
                        C89219l.m154715b();
                    }
                    eVar.f157402d = videoSegment3.f156709a;
                    eVar.mo111008a();
                    return;
                }
                float f = (floatValue * eVar.f157405g) + eVar.f157406h;
                if (eVar.f157404f != null && eVar.f157404f == null) {
                    C89219l.m154715b();
                }
                int i2 = (int) (f * 100.0f);
                if (i2 >= 100) {
                    i2 = 100;
                }
                eVar.mo111009a(i2);
            } else if (message.what == 1002) {
                C70447e eVar2 = this.f157414a;
                Object obj2 = message.obj;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Float");
                if (((Float) obj2).floatValue() >= 1.0f) {
                    if (eVar2.f157401c != null) {
                        VideoSegment videoSegment4 = eVar2.f157401c;
                        if (videoSegment4 == null) {
                            C89219l.m154715b();
                        }
                        videoSegment4.f156724p = true;
                    }
                    eVar2.f157400b++;
                    int i3 = eVar2.f157400b;
                    List<? extends VideoSegment> list3 = eVar2.f157403e;
                    if (list3 == null) {
                        C89219l.m154715b();
                    }
                    if (i3 < list3.size()) {
                        List<? extends VideoSegment> list4 = eVar2.f157403e;
                        if (list4 == null) {
                            C89219l.m154715b();
                        }
                        eVar2.f157401c = (VideoSegment) list4.get(eVar2.f157400b);
                        if (eVar2.f157401c != null) {
                            VideoSegment videoSegment5 = eVar2.f157401c;
                            if (videoSegment5 == null) {
                                C89219l.m154715b();
                            }
                            eVar2.f157402d = videoSegment5.f156709a;
                            AbstractC31071f fVar = eVar2.f157399a;
                            if (fVar == null) {
                                C89219l.m154715b();
                            }
                            fVar.mo56262a(eVar2.f157402d, new C70454g(eVar2));
                        }
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        HandlerC70452e(C70447e eVar, Looper looper) {
            super(looper);
            this.f157414a = eVar;
        }
    }

    /* renamed from: a */
    public final boolean mo111014a(VideoSegment videoSegment) {
        if (videoSegment == null) {
            return false;
        }
        return this.f157407i.contains(videoSegment.mo110571a(false).toString());
    }

    /* renamed from: a */
    public final void mo111013a(boolean z, boolean z2, boolean z3) {
        m124251d();
        AbstractC70449b bVar = this.f157404f;
        if (bVar == null) {
            return;
        }
        if (this.f157411n) {
            bVar.mo110887a(false, z2, z3);
        } else {
            bVar.mo110887a(z, z2, z3);
        }
    }
}
