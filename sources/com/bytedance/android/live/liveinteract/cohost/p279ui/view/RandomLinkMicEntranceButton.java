package com.bytedance.android.live.liveinteract.cohost.p279ui.view;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.cohost.p263a.p268e.C4592a;
import com.bytedance.android.live.liveinteract.cohost.p263a.p268e.C4595b;
import com.bytedance.android.livesdk.chatroom.interact.model.C7611i;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.RandomLinkMicEntranceButton */
public final class RandomLinkMicEntranceButton extends ConstraintLayout {

    /* renamed from: g */
    public C7611i.C7612a f12609g;

    /* renamed from: h */
    private final AbstractC89244h f12610h;

    /* renamed from: i */
    private final AbstractC89244h f12611i;

    /* renamed from: j */
    private final AbstractC89244h f12612j;

    /* renamed from: k */
    private final AbstractC89244h f12613k;

    static {
        Covode.recordClassIndex(5377);
    }

    public RandomLinkMicEntranceButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final View getMask() {
        return (View) this.f12613k.getValue();
    }

    public final LiveButton getButton() {
        return (LiveButton) this.f12610h.getValue();
    }

    public final LiveTextView getSubTitle() {
        return (LiveTextView) this.f12612j.getValue();
    }

    public final LiveTextView getTitle() {
        return (LiveTextView) this.f12611i.getValue();
    }

    public final C7611i.C7612a getBannerText() {
        return this.f12609g;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.RandomLinkMicEntranceButton$b */
    static final class C4799b extends AbstractC89220m implements AbstractC89171a<LiveButton> {

        /* renamed from: a */
        final /* synthetic */ RandomLinkMicEntranceButton f12615a;

        static {
            Covode.recordClassIndex(5379);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4799b(RandomLinkMicEntranceButton randomLinkMicEntranceButton) {
            super(0);
            this.f12615a = randomLinkMicEntranceButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveButton invoke() {
            return this.f12615a.findViewById(R.id.wk);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.RandomLinkMicEntranceButton$c */
    static final class C4800c extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ RandomLinkMicEntranceButton f12616a;

        static {
            Covode.recordClassIndex(5380);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4800c(RandomLinkMicEntranceButton randomLinkMicEntranceButton) {
            super(0);
            this.f12616a = randomLinkMicEntranceButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f12616a.findViewById(R.id.ff7);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.RandomLinkMicEntranceButton$d */
    static final class C4801d extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ RandomLinkMicEntranceButton f12617a;

        static {
            Covode.recordClassIndex(5381);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4801d(RandomLinkMicEntranceButton randomLinkMicEntranceButton) {
            super(0);
            this.f12617a = randomLinkMicEntranceButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            return this.f12617a.findViewById(R.id.f21);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.RandomLinkMicEntranceButton$e */
    static final class C4802e extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ RandomLinkMicEntranceButton f12618a;

        static {
            Covode.recordClassIndex(5382);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4802e(RandomLinkMicEntranceButton randomLinkMicEntranceButton) {
            super(0);
            this.f12618a = randomLinkMicEntranceButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            return this.f12618a.findViewById(R.id.f22);
        }
    }

    /* renamed from: b */
    public final void mo9139b() {
        getMask().setVisibility(8);
        LiveButton button = getButton();
        C7611i.C7612a aVar = this.f12609g;
        if (aVar == null) {
            C89219l.m154715b();
        }
        C4592a.m10698a(button, aVar);
        if (!getButton().isEnabled() && C4595b.m10702b()) {
            getMask().setVisibility(0);
        }
    }

    public final void setBannerText(C7611i.C7612a aVar) {
        this.f12609g = aVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.RandomLinkMicEntranceButton$a */
    static final class View$OnClickListenerC4798a implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC4798a f12614a = new View$OnClickListenerC4798a();

        static {
            Covode.recordClassIndex(5378);
        }

        View$OnClickListenerC4798a() {
        }

        public final void onClick(View view) {
            C11226ao.m19883a(C3966y.m9669e(), C3966y.m9657a((int) R.string.dsn), 0);
        }
    }

    private /* synthetic */ RandomLinkMicEntranceButton(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RandomLinkMicEntranceButton(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5345);
        this.f12610h = C89250i.m154773a((AbstractC89171a) new C4799b(this));
        this.f12611i = C89250i.m154773a((AbstractC89171a) new C4802e(this));
        this.f12612j = C89250i.m154773a((AbstractC89171a) new C4801d(this));
        this.f12613k = C89250i.m154773a((AbstractC89171a) new C4800c(this));
        ImageView imageView = (ImageView) LayoutInflater.from(context).inflate(R.layout.bep, this).findViewById(R.id.byr);
        C89219l.m154716b(imageView, "");
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        int c2 = C3966y.m9664c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(C3966y.m9655a(), 2131234226, options);
        float f = (((float) c2) * 1.0f) / ((float) options.outWidth);
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        imageView.setImageMatrix(matrix);
        getMask().setOnClickListener(View$OnClickListenerC4798a.f12614a);
        MethodCollector.m26664o(5345);
    }
}
