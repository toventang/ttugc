package com.p2082ss.android.ugc.aweme.sticker.types.p4006b;

import android.widget.SeekBar;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.b.d */
public final class C76046d {
    static {
        Covode.recordClassIndex(88990);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.b.d$a */
    public static final class C76047a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f170873a;

        static {
            Covode.recordClassIndex(88991);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }

        public C76047a(AbstractC89172b bVar) {
            this.f170873a = bVar;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f170873a.invoke(Integer.valueOf(i));
        }
    }
}
