package p4550e.p4556f;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.emoji.C2972a;
import com.bytedance.android.live.p236e.p237a.p238a.AbstractC4141a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4550e.p4551a.C88333a;
import p4550e.p4553c.AbstractC88336a;

/* renamed from: e.f.a */
public final class C88344a extends ConstraintLayout implements AbstractC88336a {

    /* renamed from: g */
    public C88333a f200545g;

    /* renamed from: h */
    public int f200546h;

    /* renamed from: i */
    private AbstractC4141a f200547i;

    static {
        Covode.recordClassIndex(104383);
    }

    private int getLayoutResource() {
        return R.layout.bds;
    }

    public final void setOnEmojiSelectListener(AbstractC4141a aVar) {
        this.f200547i = aVar;
    }

    @Override // p4550e.p4553c.AbstractC88336a
    /* renamed from: a */
    public final void mo142854a(C2972a aVar) {
        AbstractC4141a aVar2;
        if (aVar != null && (aVar2 = this.f200547i) != null) {
            aVar2.mo7240a(aVar);
        }
    }

    public C88344a(Context context) {
        super(context);
        MethodCollector.m26663i(8899);
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        MethodCollector.m26664o(8899);
    }
}
