package com.bytedance.ies.xelement.p1367d;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.SeekBar;
import androidx.appcompat.widget.C0441p;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.d.a */
public final class C19056a extends C0441p {

    /* renamed from: a */
    private AbstractC89187q<? super String, ? super Map<String, ? extends Object>, ? super C19056a, C89391z> f45147a;

    static {
        Covode.recordClassIndex(21819);
    }

    public final void setStateReporter(AbstractC89187q<? super String, ? super Map<String, ? extends Object>, ? super C19056a, C89391z> qVar) {
        this.f45147a = qVar;
    }

    /* renamed from: com.bytedance.ies.xelement.d.a$a */
    public static final class C19057a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ C19056a f45148a;

        static {
            Covode.recordClassIndex(21820);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19057a(C19056a aVar) {
            this.f45148a = aVar;
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            int i;
            if (seekBar != null) {
                i = seekBar.getProgress();
            } else {
                i = 0;
            }
            this.f45148a.mo30367a("seekbegin", C89041ag.m154412a(C89387v.m154943a("currentDuration", Integer.valueOf(i))));
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            int i;
            if (seekBar != null) {
                i = seekBar.getProgress();
            } else {
                i = 0;
            }
            this.f45148a.mo30367a("seekend", C89041ag.m154412a(C89387v.m154943a("currentDuration", Integer.valueOf(i))));
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int i2;
            if (seekBar != null) {
                i2 = seekBar.getProgress();
            } else {
                i2 = 0;
            }
            this.f45148a.mo30367a("seekchanged", C89041ag.m154412a(C89387v.m154943a("currentDuration", Integer.valueOf(i2))));
        }
    }

    public C19056a(Context context) {
        super(context);
        getThumb().clearColorFilter();
        getProgressDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        getThumb().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        setOnSeekBarChangeListener(new C19057a(this));
    }

    /* renamed from: a */
    public final void mo30367a(String str, Map<String, ? extends Object> map) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(map, "");
        AbstractC89187q<? super String, ? super Map<String, ? extends Object>, ? super C19056a, C89391z> qVar = this.f45147a;
        if (qVar != null) {
            qVar.invoke(str, map, this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
