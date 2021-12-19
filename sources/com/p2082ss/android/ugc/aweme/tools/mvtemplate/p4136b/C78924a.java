package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4136b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1196b.C17156b;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.AbstractC72273b;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72424b;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.b.a */
public final class C78924a implements AbstractC72273b {

    /* renamed from: c */
    public static final C78925a f177418c = new C78925a((byte) 0);

    /* renamed from: a */
    C17156b.C17157a f177419a;

    /* renamed from: b */
    final Activity f177420b;

    static {
        Covode.recordClassIndex(92073);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.AbstractC72273b
    /* renamed from: a */
    public final void mo114502a(Intent intent) {
        C89219l.m154721d(intent, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.b.a$a */
    public static final class C78925a {
        static {
            Covode.recordClassIndex(92074);
        }

        private C78925a() {
        }

        public /* synthetic */ C78925a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.b.a$b */
    static final class RunnableC78926b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C78924a f177421a;

        /* renamed from: b */
        final /* synthetic */ AbstractC72424b f177422b;

        /* renamed from: c */
        final /* synthetic */ String f177423c;

        static {
            Covode.recordClassIndex(92075);
        }

        RunnableC78926b(C78924a aVar, AbstractC72424b bVar, String str) {
            this.f177421a = aVar;
            this.f177422b = bVar;
            this.f177423c = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
            if (r1 == null) goto L_0x0066;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 291
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4136b.C78924a.RunnableC78926b.run():void");
        }
    }

    public C78924a(Activity activity) {
        this.f177420b = activity;
        if (activity != null && !activity.isFinishing()) {
            C17156b.C17157a aVar = new C17156b.C17157a(activity);
            aVar.f40889l = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
            aVar.f40871A = true;
            this.f177419a = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.AbstractC72273b
    /* renamed from: a */
    public final boolean mo114503a(Context context, AbstractC72424b bVar, MediaModel mediaModel, boolean z) {
        CutSameVideoImageExtraData b;
        if (bVar == null || mediaModel == null || !mediaModel.mo96674b() || (b = bVar.mo114700b()) == null || mediaModel.f134668h >= b.f162012a) {
            return true;
        }
        if (context == null) {
            return false;
        }
        Activity activity = this.f177420b;
        if (activity == null) {
            C89219l.m154715b();
        }
        String string = activity.getString(R.string.dbu, new Object[]{Float.valueOf(((float) b.f162012a) / 1000.0f)});
        C89219l.m154716b(string, "");
        if (!z) {
            C85041d.m146223a(context, string, 1).mo129984b();
            return false;
        }
        bVar.mo114703d();
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC78926b(this, bVar, string), 300);
        return false;
    }
}
