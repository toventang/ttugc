package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3204ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.view.GroupShareCardView */
public final class GroupShareCardView extends AbstractC55381a {

    /* renamed from: d */
    private final int f126621d;

    static {
        Covode.recordClassIndex(65145);
    }

    public GroupShareCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3204ui.view.AbstractC55381a
    public final int getResourceId() {
        return this.f126621d;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.view.GroupShareCardView$a */
    static final class C55378a extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C55378a f126622a = new C55378a();

        static {
            Covode.recordClassIndex(65146);
        }

        C55378a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54463b = Integer.valueOf((int) R.attr.u);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54464c = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    private /* synthetic */ GroupShareCardView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private GroupShareCardView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(3681);
        this.f126621d = R.layout.a55;
        View inflate = LayoutInflater.from(context).inflate(getResourceId(), this);
        View findViewById = inflate.findViewById(R.id.title_tv);
        C89219l.m154716b(findViewById, "");
        setTitleTv((TuxTextView) findViewById);
        View findViewById2 = inflate.findViewById(R.id.ebd);
        C89219l.m154716b(findViewById2, "");
        setSubtitleTv((TuxTextView) findViewById2);
        View findViewById3 = inflate.findViewById(R.id.on);
        C89219l.m154716b(findViewById3, "");
        setAvatarIv((RemoteImageView) findViewById3);
        setBackground(C23009f.m43397a(C55378a.f126622a).mo37389a(context));
        MethodCollector.m26664o(3681);
    }
}
