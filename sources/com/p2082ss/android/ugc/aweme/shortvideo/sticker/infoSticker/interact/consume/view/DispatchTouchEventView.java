package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75400c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispatchTouchEventView */
public final class DispatchTouchEventView extends ProgressBar {

    /* renamed from: a */
    private AbstractC75400c f163683a;

    /* renamed from: b */
    private AbstractC73037m f163684b;

    /* renamed from: c */
    private AbstractC72945a f163685c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispatchTouchEventView$a */
    public interface AbstractC72945a {
        static {
            Covode.recordClassIndex(85647);
        }

        /* renamed from: a */
        void mo115350a(int i);
    }

    static {
        Covode.recordClassIndex(85645);
    }

    public final AbstractC72945a getClickListener() {
        return this.f163685c;
    }

    public final AbstractC75400c getListener() {
        return this.f163683a;
    }

    public final AbstractC73037m getStatusView() {
        return this.f163684b;
    }

    public final void setClickListener(AbstractC72945a aVar) {
        this.f163685c = aVar;
    }

    public final void setListener(AbstractC75400c cVar) {
        this.f163683a = cVar;
    }

    public final void setStatusView(AbstractC73037m mVar) {
        this.f163684b = mVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        Integer status;
        Integer status2;
        if (!(motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null)) {
            if (valueOf.intValue() == 0) {
                AbstractC73037m mVar = this.f163684b;
                if (mVar == null || (status2 = mVar.getStatus()) == null || status2.intValue() != 0) {
                    return false;
                }
            } else if (valueOf.intValue() == 1) {
                AbstractC73037m mVar2 = this.f163684b;
                if (mVar2 == null || (status = mVar2.getStatus()) == null || status.intValue() != 0) {
                    return false;
                }
                AbstractC72945a aVar = this.f163685c;
                if (aVar != null) {
                    aVar.mo115350a(getId());
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DispatchTouchEventView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8173);
        setOnClickListener(View$OnClickListenerC729441.f163686a);
        MethodCollector.m26664o(8173);
    }
}
