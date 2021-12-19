package com.p2082ss.android.ugc.aweme.sticker.types.game;

import android.util.Pair;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.game.d */
final /* synthetic */ class C76070d implements AbstractC1214u {

    /* renamed from: a */
    private final C76067b f170916a;

    /* renamed from: b */
    private final AbstractC76079l f170917b;

    static {
        Covode.recordClassIndex(89015);
    }

    C76070d(C76067b bVar, AbstractC76079l lVar) {
        this.f170916a = bVar;
        this.f170917b = lVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C76067b bVar = this.f170916a;
        AbstractC76079l lVar = this.f170917b;
        Pair pair = (Pair) obj;
        if (pair != null && ((Boolean) pair.first).booleanValue()) {
            ShortVideoContext e = bVar.mo119808e();
            long a = C70637di.m124840a();
            if (e.f155817b.mo109889b() && e.f155817b.f155665u != 1) {
                a = e.f155817b.f155646b;
            } else if (e.mo110022c()) {
                a = 3000;
            }
            if (TimeSpeedModelExtension.calculateRealTime(bVar.f170897a.getEndFrameTimeUS() / 1000, 1.0d) + bVar.mo119808e().f155817b.f155651g >= a && bVar.f170899c) {
                bVar.f170899c = false;
                bVar.f170900d = true;
                bVar.mo119808e().f155793ac = ((Integer) pair.second).intValue();
                lVar.mo119784a();
            }
        }
    }
}
