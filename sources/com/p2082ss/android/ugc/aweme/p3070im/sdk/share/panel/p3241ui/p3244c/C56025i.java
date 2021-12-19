package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55170ab;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55194d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i */
public final class C56025i extends RecyclerView.ViewHolder {

    /* renamed from: k */
    public static final C56026a f127744k = new C56026a((byte) 0);

    /* renamed from: m */
    private static final String f127745m = "SharePanelHeadViewHolder";

    /* renamed from: n */
    private static final int f127746n = C17867d.m33078a().getResources().getDimensionPixelSize(R.dimen.ml);

    /* renamed from: a */
    public final TextView f127747a;

    /* renamed from: b */
    public final AvatarImageView f127748b;

    /* renamed from: c */
    public IMContact f127749c;

    /* renamed from: d */
    public int f127750d = -1;

    /* renamed from: e */
    public boolean f127751e;

    /* renamed from: f */
    public boolean f127752f;

    /* renamed from: g */
    public C89378p<Boolean, String> f127753g;

    /* renamed from: h */
    public boolean f127754h;

    /* renamed from: i */
    public boolean f127755i;

    /* renamed from: j */
    public final SharePanelViewModel f127756j;

    /* renamed from: l */
    private final View f127757l;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i$c */
    final /* synthetic */ class View$OnClickListenerC56030c implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f127761a;

        static {
            Covode.recordClassIndex(65824);
        }

        View$OnClickListenerC56030c(AbstractC89172b bVar) {
            this.f127761a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154716b(this.f127761a.invoke(view), "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i$a */
    public static final class C56026a {
        static {
            Covode.recordClassIndex(65820);
        }

        private C56026a() {
        }

        public /* synthetic */ C56026a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(65819);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i$d */
    public static final class C56031d implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56025i f127762a;

        static {
            Covode.recordClassIndex(65825);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C56031d(C56025i iVar) {
            this.f127762a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            mo92877a(num.intValue());
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo92877a(int i) {
            if (this.f127762a.f127747a.getMaxLines() != i) {
                this.f127762a.f127747a.setMaxLines(i);
                if (this.f127762a.f127749c instanceof IMUser) {
                    C56025i iVar = this.f127762a;
                    IMContact iMContact = iVar.f127749c;
                    Objects.requireNonNull(iMContact, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                    iVar.mo92873a((IMUser) iMContact);
                } else if (this.f127762a.f127749c instanceof IMConversation) {
                    C56025i iVar2 = this.f127762a;
                    IMContact iMContact2 = iVar2.f127749c;
                    Objects.requireNonNull(iMContact2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMConversation");
                    iVar2.mo92872a((IMConversation) iMContact2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo92872a(IMConversation iMConversation) {
        String str;
        TextView textView = this.f127747a;
        String displayName = iMConversation.getDisplayName();
        if (displayName == null || displayName.length() == 0) {
            str = "";
        } else {
            str = iMConversation.getDisplayName();
        }
        textView.setText(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i$b */
    public static final class C56027b extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56025i f127758a;

        static {
            Covode.recordClassIndex(65821);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56027b(C56025i iVar) {
            super(1);
            this.f127758a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            View view2 = view;
            C89219l.m154721d(view2, "");
            final C560281 r4 = new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C56025i.C56027b.C560281 */

                /* renamed from: a */
                final /* synthetic */ C56027b f127759a;

                static {
                    Covode.recordClassIndex(65822);
                }

                {
                    this.f127759a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    mo92875a();
                    return C89391z.f203057a;
                }

                /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                    java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
                    	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                    	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                    	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                    	at java.base/java.util.Objects.checkIndex(Objects.java:359)
                    	at java.base/java.util.ArrayList.get(ArrayList.java:427)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                    */
                /* renamed from: a */
                public final void mo92875a() {
                    /*
                    // Method dump skipped, instructions count: 104
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C56025i.C56027b.C560281.mo92875a():void");
                }
            };
            SharePackage sharePackage = this.f127758a.f127756j.f127873d;
            if (sharePackage != null) {
                Context context = view2.getContext();
                C89219l.m154716b(context, "");
                sharePackage.mo109570a(context, (AbstractC69581b) null, new AbstractC89171a<C89391z>() {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C56025i.C56027b.C560292 */

                    static {
                        Covode.recordClassIndex(65823);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        r4.mo92875a();
                        return C89391z.f203057a;
                    }
                });
            } else {
                r4.mo92875a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo92874a(boolean z) {
        int i;
        this.f127751e = z;
        this.f127757l.setSelected(z);
        View view = this.f127757l;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo92873a(IMUser iMUser) {
        boolean z;
        SpannableStringBuilder a;
        TextView textView = this.f127747a;
        String displayName = iMUser.getDisplayName();
        boolean z2 = false;
        if (displayName == null || displayName.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            a = "";
        } else {
            String displayName2 = iMUser.getDisplayName();
            C89219l.m154716b(displayName2, "");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C55194d.m100908a(displayName2));
            TextPaint paint = this.f127747a.getPaint();
            C89219l.m154716b(paint, "");
            a = C55170ab.m100878a(spannableStringBuilder, paint, f127746n, this.f127747a.getMaxLines());
        }
        textView.setText(a);
        String a2 = C89361p.m154868a(this.f127747a.getText().toString(), "\n", "");
        if ((!C89219l.m154714a((Object) iMUser.getDisplayName(), (Object) a2)) && C89361p.m154876c(a2, "...", false)) {
            z2 = true;
        }
        C80581io.m139705a(this.f127747a.getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), this.f127747a, z2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56025i(View view, SharePanelViewModel sharePanelViewModel) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(sharePanelViewModel, "");
        this.f127756j = sharePanelViewModel;
        View findViewById = view.findViewById(R.id.cpq);
        C89219l.m154716b(findViewById, "");
        TextView textView = (TextView) findViewById;
        this.f127747a = textView;
        View findViewById2 = view.findViewById(R.id.on);
        C89219l.m154716b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f127748b = avatarImageView;
        View findViewById3 = view.findViewById(R.id.bdd);
        C89219l.m154716b(findViewById3, "");
        this.f127757l = findViewById3;
        C56027b bVar = new C56027b(this);
        avatarImageView.setOnClickListener(new View$OnClickListenerC56030c(bVar));
        textView.setOnClickListener(new View$OnClickListenerC56030c(bVar));
    }
}
