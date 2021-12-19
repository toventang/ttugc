package com.p2082ss.android.ugc.aweme.filter.view.internal.main;

import android.widget.SeekBar;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50827c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.h */
public final class C50886h implements AbstractC50827c {

    /* renamed from: a */
    private final SeekBar f117405a;

    static {
        Covode.recordClassIndex(60061);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50827c
    /* renamed from: a */
    public final SeekBar mo86208a() {
        return this.f117405a;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50827c
    /* renamed from: b */
    public final boolean mo86210b() {
        if (this.f117405a.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public C50886h(SeekBar seekBar) {
        C89219l.m154721d(seekBar, "");
        this.f117405a = seekBar;
        seekBar.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50827c
    /* renamed from: a */
    public final void mo86209a(boolean z) {
        int i;
        SeekBar seekBar = this.f117405a;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        seekBar.setVisibility(i);
    }
}
