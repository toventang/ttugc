package com.p2082ss.android.ugc.aweme.sticker.favorite;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.C84969d;
import com.p2082ss.android.ugc.tools.view.style.C84971e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.favorite.a */
public final class C75359a {

    /* renamed from: a */
    public final StickerPreferences f169396a;

    static {
        Covode.recordClassIndex(88278);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.favorite.a$a */
    static final class RunnableC75360a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C75359a f169397a;

        /* renamed from: b */
        final /* synthetic */ Activity f169398b;

        /* renamed from: c */
        final /* synthetic */ View f169399c;

        static {
            Covode.recordClassIndex(88279);
        }

        RunnableC75360a(C75359a aVar, Activity activity, View view) {
            this.f169397a = aVar;
            this.f169398b = activity;
            this.f169399c = view;
        }

        public final void run() {
            C84971e.C84972a aVar = new C84971e.C84972a(this.f169398b);
            aVar.f190001r = R.string.g45;
            aVar.f189995l = 5000;
            aVar.f189979A = true;
            C84971e eVar = new C84971e(aVar);
            eVar.mo129802a();
            View contentView = eVar.getContentView();
            C89219l.m154716b(contentView, "");
            int measuredWidth = contentView.getMeasuredWidth();
            C84969d dVar = eVar.f189957e;
            if (dVar == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            float padding = ((float) ((measuredWidth - (dVar.getPADDING() * 4)) - this.f169399c.getMeasuredWidth())) + C84912r.m145930a(this.f169398b, 8.0f);
            float a = C84912r.m145930a(this.f169398b, 3.0f) + padding;
            Activity activity = this.f169398b;
            if (activity != null) {
                int i = Build.VERSION.SDK_INT;
                Resources resources = activity.getResources();
                C89219l.m154716b(resources, "");
                Configuration configuration = resources.getConfiguration();
                C89219l.m154716b(configuration, "");
                if (configuration.getLayoutDirection() == 1) {
                    eVar.mo129803a(this.f169399c, a, -((int) padding));
                    this.f169397a.f169396a.setBubbleGuideShown(true);
                }
            }
            eVar.mo129803a(this.f169399c, 4.0f, 0);
            this.f169397a.f169396a.setBubbleGuideShown(true);
        }
    }

    public C75359a(StickerPreferences stickerPreferences) {
        C89219l.m154721d(stickerPreferences, "");
        this.f169396a = stickerPreferences;
    }
}
