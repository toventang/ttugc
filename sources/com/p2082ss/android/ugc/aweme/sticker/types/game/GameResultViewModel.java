package com.p2082ss.android.ugc.aweme.sticker.types.game;

import android.util.Pair;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.game.GameResultViewModel */
public class GameResultViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public boolean f170888a;

    /* renamed from: b */
    private C1213t<Pair<Boolean, Integer>> f170889b;

    /* renamed from: c */
    private C1213t<Integer> f170890c;

    static {
        Covode.recordClassIndex(89004);
    }

    /* renamed from: a */
    public final C1213t<Pair<Boolean, Integer>> mo119778a() {
        if (this.f170889b == null) {
            this.f170889b = new C1213t<>();
        }
        return this.f170889b;
    }

    /* renamed from: b */
    public final C1213t<Integer> mo119779b() {
        if (this.f170890c == null) {
            this.f170890c = new C1213t<>();
        }
        return this.f170890c;
    }
}
