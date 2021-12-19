package com.bytedance.ies.xelement.p1364b;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.b.i */
public abstract class AbstractC19006i extends FrameLayout {

    /* renamed from: a */
    public AbstractC19000e f44974a;

    /* renamed from: b */
    private AbstractC19008b f44975b;

    /* renamed from: com.bytedance.ies.xelement.b.i$a */
    public interface AbstractC19007a {
        static {
            Covode.recordClassIndex(21756);
        }

        /* renamed from: a */
        AbstractC19006i mo30188a(Context context);
    }

    /* renamed from: com.bytedance.ies.xelement.b.i$b */
    public interface AbstractC19008b {
        static {
            Covode.recordClassIndex(21757);
        }

        /* renamed from: b */
        void mo29902b();
    }

    static {
        Covode.recordClassIndex(21755);
    }

    public final AbstractC19008b getLifecycle() {
        return this.f44975b;
    }

    public final AbstractC19000e getPlayer() {
        return this.f44974a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC19008b bVar = this.f44975b;
        if (bVar != null) {
            bVar.mo29902b();
        }
    }

    public final void setLifecycle(AbstractC19008b bVar) {
        this.f44975b = bVar;
    }

    public final void setPlayer(AbstractC19000e eVar) {
        this.f44974a = eVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AbstractC19006i(Context context) {
        super(context, null, 0);
        C89219l.m154719c(context, "");
    }

    public /* synthetic */ AbstractC19006i(Context context, byte b) {
        this(context);
    }
}
