package com.p2082ss.android.ugc.aweme.story.p4017a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.a.b */
public final class C76438b extends ConstraintLayout {

    /* renamed from: g */
    public static final C76439a f171697g = new C76439a((byte) 0);

    /* renamed from: h */
    private final TuxIconView f171698h;

    /* renamed from: i */
    private final TuxButton f171699i;

    /* renamed from: j */
    private final SmartAvatarImageView f171700j;

    /* renamed from: k */
    private final View f171701k;

    /* renamed from: l */
    private final View f171702l;

    static {
        Covode.recordClassIndex(89410);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.a.b$a */
    public static final class C76439a {
        static {
            Covode.recordClassIndex(89411);
        }

        private C76439a() {
        }

        public /* synthetic */ C76439a(byte b) {
            this();
        }
    }

    public final SmartAvatarImageView getAvatarView() {
        return this.f171700j;
    }

    public final TuxIconView getCloseBtn() {
        return this.f171698h;
    }

    public final TuxButton getCreateBtn() {
        return this.f171699i;
    }

    public final View getTutorialV5View() {
        return this.f171702l;
    }

    public final View getTutorialView() {
        return this.f171701k;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C76438b(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(4812);
        View inflate = LayoutInflater.from(context).inflate(R.layout.b1i, this);
        View findViewById = inflate.findViewById(R.id.e_5);
        C89219l.m154716b(findViewById, "");
        this.f171698h = (TuxIconView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.ag5);
        C89219l.m154716b(findViewById2, "");
        this.f171699i = (TuxButton) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.e_4);
        C89219l.m154716b(findViewById3, "");
        this.f171700j = (SmartAvatarImageView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.e_3);
        C89219l.m154716b(findViewById4, "");
        this.f171701k = findViewById4;
        View findViewById5 = inflate.findViewById(R.id.e__);
        C89219l.m154716b(findViewById5, "");
        this.f171702l = findViewById5;
        MethodCollector.m26664o(4812);
    }

    public /* synthetic */ C76438b(Context context, byte b) {
        this(context);
    }
}
