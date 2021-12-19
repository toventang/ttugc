package com.p2082ss.android.ugc.gamora.editor.toolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65335ae;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.toolbar.SeekBarHelpLinearLayout */
public final class SeekBarHelpLinearLayout extends LinearLayout {

    /* renamed from: a */
    public static final C83128a f185750a = new C83128a((byte) 0);

    /* renamed from: b */
    private float f185751b;

    /* renamed from: c */
    private AbstractC82503a f185752c;

    /* renamed from: d */
    private boolean f185753d;

    /* renamed from: e */
    private final AbstractC89244h f185754e;

    /* renamed from: f */
    private final AbstractC89244h f185755f;

    static {
        Covode.recordClassIndex(97011);
    }

    private final int getBigSeekBarTouchY() {
        return ((Number) this.f185754e.getValue()).intValue();
    }

    private final int getScreenWidth() {
        return ((Number) this.f185755f.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.SeekBarHelpLinearLayout$a */
    public static final class C83128a {
        static {
            Covode.recordClassIndex(97012);
        }

        private C83128a() {
        }

        public /* synthetic */ C83128a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.SeekBarHelpLinearLayout$b */
    static final class C83129b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C83129b f185756a = new C83129b();

        static {
            Covode.recordClassIndex(97013);
        }

        C83129b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) C84912r.m145929a(40.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.SeekBarHelpLinearLayout$c */
    static final class C83130c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C83130c f185757a = new C83130c();

        static {
            Covode.recordClassIndex(97014);
        }

        C83130c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C84912r.m145931a(C63247i.f143610a));
        }
    }

    public final void setEditPreviewProgressApi(AbstractC82503a aVar) {
        this.f185752c = aVar;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (!C65335ae.m117020e()) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f185751b = motionEvent.getX();
            this.f185753d = false;
        } else if (action == 2 && m143546a(motionEvent.getX(), motionEvent.getY())) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC82503a aVar;
        float x;
        C89219l.m154721d(motionEvent, "");
        if (!C65335ae.m117020e()) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (m143546a(motionEvent.getX(), motionEvent.getY()) && !this.f185753d) {
                        AbstractC82503a aVar2 = this.f185752c;
                        if (aVar2 != null) {
                            aVar2.mo127590b(1, 0);
                        }
                        this.f185753d = true;
                    }
                    if (this.f185753d) {
                        if (C80471gb.m139482a()) {
                            x = 100.0f - ((motionEvent.getX() * 100.0f) / ((float) getScreenWidth()));
                        } else {
                            x = (motionEvent.getX() * 100.0f) / ((float) getScreenWidth());
                        }
                        AbstractC82503a aVar3 = this.f185752c;
                        if (aVar3 != null) {
                            aVar3.mo127590b(2, (int) x);
                        }
                    }
                }
            } else if (this.f185753d && (aVar = this.f185752c) != null) {
                aVar.mo127590b(3, 0);
            }
            return super.onTouchEvent(motionEvent);
        }
        this.f185751b = motionEvent.getX();
        this.f185753d = false;
        if (((int) motionEvent.getY()) <= getBigSeekBarTouchY()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SeekBarHelpLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        C89219l.m154721d(context, "");
    }

    /* renamed from: a */
    private final boolean m143546a(float f, float f2) {
        if (Math.abs(this.f185751b - f) < 50.0f || f2 >= ((float) getBigSeekBarTouchY())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SeekBarHelpLinearLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11456);
        this.f185754e = C89250i.m154773a((AbstractC89171a) C83129b.f185756a);
        this.f185755f = C89250i.m154773a((AbstractC89171a) C83130c.f185757a);
        MethodCollector.m26664o(11456);
    }
}
