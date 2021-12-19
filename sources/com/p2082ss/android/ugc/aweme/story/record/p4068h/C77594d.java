package com.p2082ss.android.ugc.aweme.story.record.p4068h;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.tux.p1722h.C23160g;
import com.p2082ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel;
import com.p2082ss.android.ugc.aweme.story.record.p4063c.C77494b;
import com.p2082ss.android.ugc.aweme.story.record.p4063c.C77495c;
import com.p2082ss.android.ugc.aweme.story.record.p4066f.C77561a;
import com.p2082ss.android.ugc.aweme.story.record.widget.StoryRecordLayout;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.record.h.d */
public final class C77594d extends AbstractC22219j implements AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f174022a = {new C89232y(C77594d.class, "recordContext", "getRecordContext()Lcom/ss/android/ugc/aweme/story/record/model/StoryRecordContext;", 0)};

    /* renamed from: v */
    public static final C77595a f174023v = new C77595a((byte) 0);

    /* renamed from: b */
    public StoryRecordLayout.AbstractC77674c f174024b;

    /* renamed from: c */
    final AbstractC89248d f174025c = C21572a.m40504a(getDiContainer(), C77561a.class);

    /* renamed from: d */
    final AbstractC89244h f174026d = C89250i.m154773a((AbstractC89171a) new C77598d(this));

    /* renamed from: e */
    RectF f174027e;

    /* renamed from: f */
    View f174028f;

    /* renamed from: g */
    View f174029g;

    /* renamed from: h */
    View f174030h;

    /* renamed from: i */
    StoryRecordLayout f174031i;

    /* renamed from: j */
    public TextView f174032j;

    /* renamed from: k */
    TextView f174033k;

    /* renamed from: l */
    TextView f174034l;

    /* renamed from: t */
    public boolean f174035t;

    /* renamed from: u */
    public boolean f174036u;

    /* renamed from: w */
    private final AbstractC89244h f174037w = C89250i.m154773a((AbstractC89171a) new C77599e(this));

    /* renamed from: x */
    private final View.OnTouchListener f174038x = new View$OnTouchListenerC77596b(this);

    /* renamed from: y */
    private final C21582f f174039y;

    static {
        Covode.recordClassIndex(90631);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.h.d$a */
    public static final class C77595a {
        static {
            Covode.recordClassIndex(90632);
        }

        private C77595a() {
        }

        public /* synthetic */ C77595a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f174039y;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.h.d$c */
    public static final class C77597c implements StoryRecordLayout.AbstractC77674c {

        /* renamed from: a */
        final /* synthetic */ C77594d f174041a;

        static {
            Covode.recordClassIndex(90634);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.record.widget.StoryRecordLayout.AbstractC77674c
        /* renamed from: b */
        public final void mo121145b() {
            StoryRecordLayout.AbstractC77674c cVar = this.f174041a.f174024b;
            if (cVar != null) {
                cVar.mo121145b();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.story.record.widget.StoryRecordLayout.AbstractC77674c
        /* renamed from: c */
        public final void mo121146c() {
            StoryRecordLayout.AbstractC77674c cVar = this.f174041a.f174024b;
            if (cVar != null) {
                cVar.mo121146c();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.story.record.widget.StoryRecordLayout.AbstractC77674c
        /* renamed from: a */
        public final void mo121143a() {
            StoryRecordLayout.AbstractC77674c cVar = this.f174041a.f174024b;
            if (cVar != null) {
                cVar.mo121143a();
            }
            if (C77494b.f173831a) {
                C77594d dVar = this.f174041a;
                View view = dVar.f174028f;
                if (view == null) {
                    C89219l.m154710a("lockLayout");
                }
                view.setVisibility(0);
                View view2 = dVar.f174028f;
                if (view2 == null) {
                    C89219l.m154710a("lockLayout");
                }
                C77594d.m135587a(view2, 200);
                TextView textView = dVar.f174032j;
                if (textView == null) {
                    C89219l.m154710a("iDleHint");
                }
                C77594d.m135586a(textView);
                TextView textView2 = dVar.f174033k;
                if (textView2 == null) {
                    C89219l.m154710a("dragLeftHint");
                }
                textView2.setVisibility(0);
                TextView textView3 = dVar.f174033k;
                if (textView3 == null) {
                    C89219l.m154710a("dragLeftHint");
                }
                C77594d.m135587a(textView3, 300);
                return;
            }
            TextView textView4 = this.f174041a.f174032j;
            if (textView4 == null) {
                C89219l.m154710a("iDleHint");
            }
            C77594d.m135586a(textView4);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C77597c(C77594d dVar) {
            this.f174041a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.story.record.widget.StoryRecordLayout.AbstractC77674c
        /* renamed from: a */
        public final void mo121144a(float f, float f2) {
            StoryRecordLayout.AbstractC77674c cVar = this.f174041a.f174024b;
            if (cVar != null) {
                cVar.mo121144a(f, f2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.h.d$d */
    static final class C77598d extends AbstractC89220m implements AbstractC89171a<StoryRecordBaseViewModel> {

        /* renamed from: a */
        final /* synthetic */ C77594d f174042a;

        static {
            Covode.recordClassIndex(90635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77598d(C77594d dVar) {
            super(0);
            this.f174042a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryRecordBaseViewModel invoke() {
            JediViewModel a = C20531t.m38716a(C22228c.m41832b(this.f174042a)).mo33800a(StoryRecordBaseViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.h.d$e */
    static final class C77599e extends AbstractC89220m implements AbstractC89171a<C23160g> {

        /* renamed from: a */
        final /* synthetic */ C77594d f174043a;

        static {
            Covode.recordClassIndex(90636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77599e(C77594d dVar) {
            super(0);
            this.f174043a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C23160g invoke() {
            Context s = this.f174043a.mo36485s();
            C89219l.m154716b(s, "");
            return new C23160g(s);
        }
    }

    /* renamed from: a */
    static void m135586a(View view) {
        if (view.getAlpha() < 1.0f) {
            view.setAlpha(1.0f);
        }
        view.animate().alpha(0.0f).setDuration(300).start();
    }

    public C77594d(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f174039y = fVar;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        int i;
        int i2;
        StoryRecordLayout.EnumC77673b bVar;
        int i3;
        super.mo22704a(bundle);
        View c = mo36475c(R.id.cgf);
        C89219l.m154716b(c, "");
        this.f174028f = c;
        View c2 = mo36475c(R.id.f9j);
        C89219l.m154716b(c2, "");
        this.f174029g = c2;
        if (c2 == null) {
            C89219l.m154710a("unLockIcon");
        }
        if (C78099c.m136517a(mo36485s())) {
            i = R.drawable.bln;
        } else {
            i = R.drawable.blm;
        }
        c2.setBackgroundResource(i);
        View c3 = mo36475c(R.id.cgh);
        C89219l.m154716b(c3, "");
        this.f174030h = c3;
        View c4 = mo36475c(R.id.dg5);
        C89219l.m154716b(c4, "");
        this.f174031i = (StoryRecordLayout) c4;
        View c5 = mo36475c(R.id.bip);
        C89219l.m154716b(c5, "");
        this.f174032j = (TextView) c5;
        View c6 = mo36475c(R.id.aou);
        C89219l.m154716b(c6, "");
        TextView textView = (TextView) c6;
        this.f174033k = textView;
        if (textView == null) {
            C89219l.m154710a("dragLeftHint");
        }
        Context s = mo36485s();
        if (C78099c.m136517a(mo36485s())) {
            i2 = R.string.g5p;
        } else {
            i2 = R.string.g5o;
        }
        textView.setText(s.getText(i2));
        View c7 = mo36475c(R.id.dhn);
        C89219l.m154716b(c7, "");
        this.f174034l = (TextView) c7;
        StoryRecordLayout storyRecordLayout = this.f174031i;
        if (storyRecordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        storyRecordLayout.setListener(new C77597c(this));
        StoryRecordLayout storyRecordLayout2 = this.f174031i;
        if (storyRecordLayout2 == null) {
            C89219l.m154710a("recordLayout");
        }
        if (C77495c.f173833a == 1) {
            bVar = StoryRecordLayout.EnumC77673b.RECORD_LAYOUT_MODE_2;
        } else {
            bVar = StoryRecordLayout.EnumC77673b.RECORD_LAYOUT_MODE_1;
        }
        storyRecordLayout2.setMode(bVar);
        StoryRecordLayout storyRecordLayout3 = this.f174031i;
        if (storyRecordLayout3 == null) {
            C89219l.m154710a("recordLayout");
        }
        storyRecordLayout3.setOnTouchListener(this.f174038x);
        TextView textView2 = this.f174032j;
        if (textView2 == null) {
            C89219l.m154710a("iDleHint");
        }
        Context s2 = mo36485s();
        if (C77495c.f173833a == 0) {
            i3 = R.string.g5s;
        } else {
            i3 = R.string.g5r;
        }
        textView2.setText(s2.getText(i3));
    }

    /* renamed from: a */
    public final void mo121147a(boolean z) {
        if (z) {
            View view = this.f174029g;
            if (view == null) {
                C89219l.m154710a("unLockIcon");
            }
            view.animate().alpha(0.0f).setDuration(200).start();
            View view2 = this.f174030h;
            if (view2 == null) {
                C89219l.m154710a("lockedIcon");
            }
            view2.setVisibility(0);
            view2.setScaleX(0.0f);
            view2.setScaleY(0.0f);
            view2.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300).setStartDelay(200).start();
            TextView textView = this.f174034l;
            if (textView == null) {
                C89219l.m154710a("releaseHint");
            }
            textView.setVisibility(0);
            TextView textView2 = this.f174034l;
            if (textView2 == null) {
                C89219l.m154710a("releaseHint");
            }
            m135587a(textView2, 300);
            TextView textView3 = this.f174033k;
            if (textView3 == null) {
                C89219l.m154710a("dragLeftHint");
            }
            m135586a(textView3);
            if (Build.VERSION.SDK_INT >= 29) {
                ((C23160g) this.f174037w.getValue()).mo37653b();
                return;
            }
            Context s = mo36485s();
            C89219l.m154716b(s, "");
            new C23160g(s).mo37652a();
            return;
        }
        View view3 = this.f174030h;
        if (view3 == null) {
            C89219l.m154710a("lockedIcon");
        }
        view3.animate().scaleY(0.0f).scaleX(0.0f).setDuration(300).start();
        View view4 = this.f174029g;
        if (view4 == null) {
            C89219l.m154710a("unLockIcon");
        }
        view4.animate().alpha(1.0f).setDuration(200).setStartDelay(300).start();
        TextView textView4 = this.f174034l;
        if (textView4 == null) {
            C89219l.m154710a("releaseHint");
        }
        m135586a(textView4);
        TextView textView5 = this.f174033k;
        if (textView5 == null) {
            C89219l.m154710a("dragLeftHint");
        }
        m135587a(textView5, 300);
    }

    /* renamed from: a */
    static void m135587a(View view, long j) {
        if (view.getAlpha() > 0.0f) {
            view.setAlpha(0.0f);
        }
        view.animate().alpha(1.0f).setDuration(j).start();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b24, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.h.d$b */
    static final class View$OnTouchListenerC77596b implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C77594d f174040a;

        static {
            Covode.recordClassIndex(90633);
        }

        View$OnTouchListenerC77596b(C77594d dVar) {
            this.f174040a = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r2 != 3) goto L_0x0019;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouch(android.view.View r17, android.view.MotionEvent r18) {
            /*
            // Method dump skipped, instructions count: 391
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.record.p4068h.C77594d.View$OnTouchListenerC77596b.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }
}
