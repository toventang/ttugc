package com.bytedance.tux.extension.player.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.AbstractC0549a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.extension.player.C23098e;
import com.bytedance.tux.extension.player.EnumC23096c;
import com.bytedance.tux.extension.player.EnumC23097d;
import com.bytedance.tux.extension.player.p1718a.AbstractView$OnClickListenerC23076a;
import com.bytedance.tux.extension.player.p1718a.C23088d;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.input.slider.TuxSlider;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

public final class PlayerMaskView extends FrameLayout {

    /* renamed from: e */
    public static final C23101a f54676e = new C23101a((byte) 0);

    /* renamed from: a */
    public AbstractC23102b f54677a;

    /* renamed from: b */
    public boolean f54678b;

    /* renamed from: c */
    public boolean f54679c;

    /* renamed from: d */
    public boolean f54680d;

    /* renamed from: f */
    private HashMap f54681f;

    /* renamed from: com.bytedance.tux.extension.player.view.PlayerMaskView$b */
    public interface AbstractC23102b {
        static {
            Covode.recordClassIndex(27027);
        }

        /* renamed from: a */
        void mo37561a();

        /* renamed from: a */
        void mo37562a(int i);

        /* renamed from: b */
        void mo37563b();

        /* renamed from: b */
        void mo37564b(int i);

        /* renamed from: c */
        void mo37565c();

        /* renamed from: d */
        void mo37566d();

        /* renamed from: e */
        void mo37567e();
    }

    static {
        Covode.recordClassIndex(27025);
    }

    /* renamed from: a */
    public final View mo37547a(int i) {
        if (this.f54681f == null) {
            this.f54681f = new HashMap();
        }
        View view = (View) this.f54681f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f54681f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.tux.extension.player.view.PlayerMaskView$a */
    public static final class C23101a {
        static {
            Covode.recordClassIndex(27026);
        }

        private C23101a() {
        }

        public /* synthetic */ C23101a(byte b) {
            this();
        }
    }

    public final boolean getNeedShowMask() {
        return this.f54680d;
    }

    public final AbstractC23102b getOnPlayerActionBarListener() {
        return this.f54677a;
    }

    /* renamed from: a */
    public final void mo37548a() {
        this.f54680d = true;
        C23088d.m43535a(mo37547a(R.id.acf), null, 6);
    }

    /* renamed from: b */
    public final void mo37550b() {
        C23088d.m43535a(mo37547a(R.id.acf), new C23111k(this), 2);
    }

    /* renamed from: e */
    public final void mo37553e() {
        View a = mo37547a(R.id.bx);
        C89219l.m154709a((Object) a, "");
        a.setVisibility(0);
    }

    /* renamed from: c */
    public final void mo37551c() {
        this.f54679c = false;
        Group group = (Group) mo37547a(R.id.d2v);
        C89219l.m154709a((Object) group, "");
        group.setVisibility(8);
        if (C23098e.f54672b != EnumC23096c.PREVIEW || C23098e.f54671a == EnumC23097d.PLAYER_IDLE) {
            TuxPlayerStateView tuxPlayerStateView = (TuxPlayerStateView) mo37547a(R.id.d2m);
            C89219l.m154709a((Object) tuxPlayerStateView, "");
            tuxPlayerStateView.setVisibility(0);
        }
    }

    /* renamed from: d */
    public final void mo37552d() {
        if (this.f54679c || (C23098e.f54672b == EnumC23096c.PREVIEW && C23098e.f54671a != EnumC23097d.PLAYER_IDLE)) {
            TuxPlayerStateView tuxPlayerStateView = (TuxPlayerStateView) mo37547a(R.id.d2m);
            C89219l.m154709a((Object) tuxPlayerStateView, "");
            tuxPlayerStateView.setVisibility(8);
            return;
        }
        TuxPlayerStateView tuxPlayerStateView2 = (TuxPlayerStateView) mo37547a(R.id.d2m);
        C89219l.m154709a((Object) tuxPlayerStateView2, "");
        tuxPlayerStateView2.setVisibility(0);
        Group group = (Group) mo37547a(R.id.d2v);
        C89219l.m154709a((Object) group, "");
        group.setVisibility(8);
        TuxPlayerTimeView tuxPlayerTimeView = (TuxPlayerTimeView) mo37547a(R.id.ei1);
        C89219l.m154709a((Object) tuxPlayerTimeView, "");
        tuxPlayerTimeView.setVisibility(8);
    }

    public final void setCustomSliding(boolean z) {
        this.f54678b = z;
    }

    public final void setLoading(boolean z) {
        this.f54679c = z;
    }

    public final void setNeedShowMask(boolean z) {
        this.f54680d = z;
    }

    public final void setOnPlayerActionBarListener(AbstractC23102b bVar) {
        this.f54677a = bVar;
    }

    /* renamed from: com.bytedance.tux.extension.player.view.PlayerMaskView$c */
    public static final class C23103c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ PlayerMaskView f54682a;

        static {
            Covode.recordClassIndex(27028);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C23103c(PlayerMaskView playerMaskView) {
            this.f54682a = playerMaskView;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f54682a.setNeedShowMask(false);
        }
    }

    /* renamed from: com.bytedance.tux.extension.player.view.PlayerMaskView$h */
    public static final class C23108h implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ PlayerMaskView f54691a;

        static {
            Covode.recordClassIndex(27033);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C23108h(PlayerMaskView playerMaskView) {
            this.f54691a = playerMaskView;
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            this.f54691a.setCustomSliding(true);
            AbstractC23102b onPlayerActionBarListener = this.f54691a.getOnPlayerActionBarListener();
            if (onPlayerActionBarListener != null) {
                onPlayerActionBarListener.mo37567e();
            }
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            int i = 0;
            this.f54691a.setCustomSliding(false);
            AbstractC23102b onPlayerActionBarListener = this.f54691a.getOnPlayerActionBarListener();
            if (onPlayerActionBarListener != null) {
                if (seekBar != null) {
                    i = seekBar.getProgress();
                }
                onPlayerActionBarListener.mo37564b(i);
            }
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            AbstractC23102b onPlayerActionBarListener = this.f54691a.getOnPlayerActionBarListener();
            if (onPlayerActionBarListener != null) {
                onPlayerActionBarListener.mo37562a(i);
            }
        }
    }

    /* renamed from: com.bytedance.tux.extension.player.view.PlayerMaskView$k */
    public static final class C23111k extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ PlayerMaskView f54694a;

        static {
            Covode.recordClassIndex(27036);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C23111k(PlayerMaskView playerMaskView) {
            this.f54694a = playerMaskView;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f54694a.setNeedShowMask(true);
            this.f54694a.mo37549a(3000L);
        }
    }

    /* renamed from: com.bytedance.tux.extension.player.view.PlayerMaskView$d */
    public static final class C23104d extends AbstractView$OnClickListenerC23076a {

        /* renamed from: c */
        final /* synthetic */ long f54683c = 300;

        /* renamed from: d */
        final /* synthetic */ PlayerMaskView f54684d;

        static {
            Covode.recordClassIndex(27029);
        }

        public C23104d(PlayerMaskView playerMaskView) {
            this.f54684d = playerMaskView;
        }

        @Override // com.bytedance.tux.extension.player.p1718a.AbstractView$OnClickListenerC23076a
        /* renamed from: a */
        public final void mo37516a(View view) {
            AbstractC23102b onPlayerActionBarListener;
            if (view != null && this.f54684d.getNeedShowMask() && (onPlayerActionBarListener = this.f54684d.getOnPlayerActionBarListener()) != null) {
                onPlayerActionBarListener.mo37563b();
            }
        }
    }

    /* renamed from: com.bytedance.tux.extension.player.view.PlayerMaskView$e */
    public static final class C23105e extends AbstractView$OnClickListenerC23076a {

        /* renamed from: c */
        final /* synthetic */ long f54685c = 300;

        /* renamed from: d */
        final /* synthetic */ PlayerMaskView f54686d;

        static {
            Covode.recordClassIndex(27030);
        }

        public C23105e(PlayerMaskView playerMaskView) {
            this.f54686d = playerMaskView;
        }

        @Override // com.bytedance.tux.extension.player.p1718a.AbstractView$OnClickListenerC23076a
        /* renamed from: a */
        public final void mo37516a(View view) {
            AbstractC23102b onPlayerActionBarListener;
            if (view != null && this.f54686d.getNeedShowMask() && (onPlayerActionBarListener = this.f54686d.getOnPlayerActionBarListener()) != null) {
                onPlayerActionBarListener.mo37565c();
            }
        }
    }

    /* renamed from: com.bytedance.tux.extension.player.view.PlayerMaskView$f */
    public static final class C23106f extends AbstractView$OnClickListenerC23076a {

        /* renamed from: c */
        final /* synthetic */ long f54687c = 300;

        /* renamed from: d */
        final /* synthetic */ PlayerMaskView f54688d;

        static {
            Covode.recordClassIndex(27031);
        }

        public C23106f(PlayerMaskView playerMaskView) {
            this.f54688d = playerMaskView;
        }

        @Override // com.bytedance.tux.extension.player.p1718a.AbstractView$OnClickListenerC23076a
        /* renamed from: a */
        public final void mo37516a(View view) {
            AbstractC23102b onPlayerActionBarListener;
            if (view != null && (onPlayerActionBarListener = this.f54688d.getOnPlayerActionBarListener()) != null) {
                onPlayerActionBarListener.mo37566d();
            }
        }
    }

    /* renamed from: com.bytedance.tux.extension.player.view.PlayerMaskView$g */
    public static final class C23107g extends AbstractView$OnClickListenerC23076a {

        /* renamed from: c */
        final /* synthetic */ long f54689c = 300;

        /* renamed from: d */
        final /* synthetic */ PlayerMaskView f54690d;

        static {
            Covode.recordClassIndex(27032);
        }

        public C23107g(PlayerMaskView playerMaskView) {
            this.f54690d = playerMaskView;
        }

        @Override // com.bytedance.tux.extension.player.p1718a.AbstractView$OnClickListenerC23076a
        /* renamed from: a */
        public final void mo37516a(View view) {
            AbstractC23102b onPlayerActionBarListener;
            if (view != null && (onPlayerActionBarListener = this.f54690d.getOnPlayerActionBarListener()) != null) {
                onPlayerActionBarListener.mo37561a();
            }
        }
    }

    public final void setNetSpeed(int i) {
        TuxTextView tuxTextView = (TuxTextView) mo37547a(R.id.d2y);
        C89219l.m154709a((Object) tuxTextView, "");
        tuxTextView.setText(i + " KB/s");
    }

    /* renamed from: a */
    public final void mo37549a(long j) {
        C23088d.RunnableC23089a aVar = new C23088d.RunnableC23089a(mo37547a(R.id.acf), new C23103c(this));
        C23088d.f54658a = aVar;
        C23088d.m43534a().removeCallbacksAndMessages(null);
        C23088d.m43534a().postDelayed(aVar, j);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PlayerMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        C89219l.m154719c(context, "");
    }

    /* renamed from: com.bytedance.tux.extension.player.view.PlayerMaskView$i */
    static final class View$OnTouchListenerC23109i implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ PlayerMaskView f54692a;

        static {
            Covode.recordClassIndex(27034);
        }

        View$OnTouchListenerC23109i(PlayerMaskView playerMaskView) {
            this.f54692a = playerMaskView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Integer valueOf;
            if (motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null) {
                return false;
            }
            if (valueOf.intValue() == 0) {
                this.f54692a.mo37548a();
                return false;
            } else if ((valueOf.intValue() != 1 && valueOf.intValue() != 3) || C23098e.f54671a != EnumC23097d.PLAYER_START) {
                return false;
            } else {
                this.f54692a.mo37549a(3000L);
                return false;
            }
        }
    }

    /* renamed from: com.bytedance.tux.extension.player.view.PlayerMaskView$j */
    static final class View$OnTouchListenerC23110j implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ PlayerMaskView f54693a;

        static {
            Covode.recordClassIndex(27035);
        }

        View$OnTouchListenerC23110j(PlayerMaskView playerMaskView) {
            this.f54693a = playerMaskView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Integer valueOf;
            if (motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null || valueOf.intValue() == 0) {
                return false;
            }
            if (valueOf.intValue() != 1 && valueOf.intValue() != 3) {
                return false;
            }
            if (!this.f54693a.getNeedShowMask()) {
                this.f54693a.mo37550b();
                return false;
            }
            this.f54693a.mo37549a(0L);
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PlayerMaskView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(8911);
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.biu, this, true);
        AbstractC0549a aVar = (AbstractC0549a) mo37547a(R.id.d2v);
        C89219l.m154709a((Object) aVar, "");
        aVar.setReferencedIds(new int[]{R.id.d2x, R.id.d2y});
        Group group = (Group) mo37547a(R.id.d2v);
        C89219l.m154709a((Object) group, "");
        group.setVisibility(8);
        AbstractC0549a aVar2 = (AbstractC0549a) mo37547a(R.id.fch);
        C89219l.m154709a((Object) aVar2, "");
        aVar2.setReferencedIds(new int[]{R.id.fci, R.id.d31, R.id.d32});
        Group group2 = (Group) mo37547a(R.id.fch);
        C89219l.m154709a((Object) group2, "");
        group2.setVisibility(8);
        AbstractC0549a aVar3 = (AbstractC0549a) mo37547a(R.id.fdg);
        C89219l.m154709a((Object) aVar3, "");
        aVar3.setReferencedIds(new int[]{R.id.fdh, R.id.d33, R.id.d34});
        Group group3 = (Group) mo37547a(R.id.fdg);
        C89219l.m154709a((Object) group3, "");
        group3.setVisibility(8);
        TuxPlayerStateView tuxPlayerStateView = (TuxPlayerStateView) mo37547a(R.id.d2w);
        C89219l.m154709a((Object) tuxPlayerStateView, "");
        tuxPlayerStateView.setOnClickListener(new C23104d(this));
        ((TuxSlider) mo37547a(R.id.e2x)).setOnSeekBarChangeListener(new C23108h(this));
        ImageView imageView = (ImageView) mo37547a(R.id.b9g);
        C89219l.m154709a((Object) imageView, "");
        imageView.setOnClickListener(new C23105e(this));
        TuxPlayerStateView tuxPlayerStateView2 = (TuxPlayerStateView) mo37547a(R.id.e4q);
        C89219l.m154709a((Object) tuxPlayerStateView2, "");
        tuxPlayerStateView2.setOnClickListener(new C23106f(this));
        View a = mo37547a(R.id.fdh);
        C89219l.m154709a((Object) a, "");
        a.setOnClickListener(new C23107g(this));
        ((TuxSlider) mo37547a(R.id.e2x)).setOnTouchListener(new View$OnTouchListenerC23109i(this));
        ((ConstraintLayout) mo37547a(R.id.acf)).setOnTouchListener(new View$OnTouchListenerC23110j(this));
        MethodCollector.m26664o(8911);
    }
}
