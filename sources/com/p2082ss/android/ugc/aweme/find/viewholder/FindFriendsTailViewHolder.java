package com.p2082ss.android.ugc.aweme.find.viewholder;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.find.viewmodel.FindFriendsState;
import com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51506b;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.find.viewholder.FindFriendsTailViewHolder */
public final class FindFriendsTailViewHolder extends FindFriendsBaseViewHolder implements AbstractC33974au {

    /* renamed from: c */
    public int f117667c;

    /* renamed from: d */
    public final View f117668d;

    static {
        Covode.recordClassIndex(60185);
    }

    @Override // com.p2082ss.android.ugc.aweme.find.viewholder.FindFriendsBaseViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.find.viewholder.FindFriendsTailViewHolder$a */
    public static final class C51008a extends AbstractC89220m implements AbstractC89172b<FindFriendsState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FindFriendsTailViewHolder f117672a;

        static {
            Covode.recordClassIndex(60189);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51008a(FindFriendsTailViewHolder findFriendsTailViewHolder) {
            super(1);
            this.f117672a = findFriendsTailViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FindFriendsState findFriendsState) {
            FindFriendsState findFriendsState2 = findFriendsState;
            C89219l.m154721d(findFriendsState2, "");
            this.f117672a.mo86341a(findFriendsState2.getTailChannels());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.find.viewholder.FindFriendsTailViewHolder$b */
    public static final class View$OnClickListenerC51009b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FindFriendsTailViewHolder f117673a;

        static {
            Covode.recordClassIndex(60190);
        }

        View$OnClickListenerC51009b(FindFriendsTailViewHolder findFriendsTailViewHolder) {
            this.f117673a = findFriendsTailViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117673a.f117639a.mo86374b(103);
            C51488a.m95921a("contact", this.f117673a.f117639a.f117700c, C51506b.m95979b());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.find.viewholder.FindFriendsTailViewHolder$c */
    public static final class View$OnClickListenerC51010c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FindFriendsTailViewHolder f117674a;

        static {
            Covode.recordClassIndex(60191);
        }

        View$OnClickListenerC51010c(FindFriendsTailViewHolder findFriendsTailViewHolder) {
            this.f117674a = findFriendsTailViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117674a.f117639a.mo86374b(102);
            C51488a.m95938d();
            C51488a.m95921a("facebook", this.f117674a.f117639a.f117700c, FindFriendsTailViewHolder.m95405a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.find.viewholder.FindFriendsTailViewHolder$d */
    public static final class View$OnClickListenerC51011d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FindFriendsTailViewHolder f117675a;

        static {
            Covode.recordClassIndex(60192);
        }

        View$OnClickListenerC51011d(FindFriendsTailViewHolder findFriendsTailViewHolder) {
            this.f117675a = findFriendsTailViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117675a.f117639a.mo86374b(101);
            C51488a.m95912a("find_friends_page");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FindFriendsTailViewHolder(android.view.ViewGroup r4) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131559488(0x7f0d0440, float:1.8744321E38)
            r0 = 0
            android.view.View r1 = com.C1764a.m5927a(r2, r1, r4, r0)
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            r3.<init>(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.find.viewholder.FindFriendsTailViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* renamed from: a */
    public final void mo86341a(List<Integer> list) {
        if (list.contains(1)) {
            this.f117667c = 1;
            ((TuxIconView) this.f117668d.findViewById(R.id.av7)).setIconRes(R.raw.icon_color_contact_circle);
            TuxTextView tuxTextView = (TuxTextView) this.f117668d.findViewById(R.id.avc);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(this.f117668d.getResources().getString(R.string.a6p));
            TuxTextView tuxTextView2 = (TuxTextView) this.f117668d.findViewById(R.id.av3);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(this.f117668d.getResources().getString(R.string.a6k));
            TuxButton tuxButton = (TuxButton) this.f117668d.findViewById(R.id.auz);
            C89219l.m154716b(tuxButton, "");
            tuxButton.setText(this.f117668d.getResources().getString(R.string.a7e));
            ((TuxButton) this.f117668d.findViewById(R.id.auz)).setOnClickListener(new View$OnClickListenerC51009b(this));
        } else if (list.contains(2)) {
            this.f117667c = 2;
            ((TuxIconView) this.f117668d.findViewById(R.id.av7)).setIconRes(R.raw.icon_color_facebook_circle);
            TuxTextView tuxTextView3 = (TuxTextView) this.f117668d.findViewById(R.id.avc);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setText(this.f117668d.getResources().getString(R.string.bse));
            TuxTextView tuxTextView4 = (TuxTextView) this.f117668d.findViewById(R.id.av3);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setText(this.f117668d.getResources().getString(R.string.a6k));
            TuxButton tuxButton2 = (TuxButton) this.f117668d.findViewById(R.id.auz);
            C89219l.m154716b(tuxButton2, "");
            tuxButton2.setText(this.f117668d.getResources().getString(R.string.a7e));
            ((TuxButton) this.f117668d.findViewById(R.id.auz)).setOnClickListener(new View$OnClickListenerC51010c(this));
        } else {
            this.f117667c = 0;
            ((TuxIconView) this.f117668d.findViewById(R.id.av7)).setIconRes(R.raw.icon_color_invitation_circle);
            TuxTextView tuxTextView5 = (TuxTextView) this.f117668d.findViewById(R.id.avc);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setText(this.f117668d.getResources().getString(R.string.a6q));
            TuxTextView tuxTextView6 = (TuxTextView) this.f117668d.findViewById(R.id.av3);
            C89219l.m154716b(tuxTextView6, "");
            tuxTextView6.setText(this.f117668d.getResources().getString(R.string.a6l));
            TuxButton tuxButton3 = (TuxButton) this.f117668d.findViewById(R.id.auz);
            C89219l.m154716b(tuxButton3, "");
            tuxButton3.setText(this.f117668d.getResources().getString(R.string.a7c));
            ((TuxButton) this.f117668d.findViewById(R.id.auz)).setOnClickListener(new View$OnClickListenerC51011d(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FindFriendsTailViewHolder(ViewGroup viewGroup, View view) {
        super(view);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(view, "");
        this.f117668d = view;
        this.f117640b.getLifecycle().mo4012a(this);
        AbstractC88412b unused = selectSubscribe(this.f117639a, C51020b.f117695a, new C20370ah(), new AbstractC89183m<AbstractC20477i, List<? extends Integer>, C89391z>(this) {
            /* class com.p2082ss.android.ugc.aweme.find.viewholder.FindFriendsTailViewHolder.C510051 */

            /* renamed from: a */
            final /* synthetic */ FindFriendsTailViewHolder f117669a;

            static {
                Covode.recordClassIndex(60186);
            }

            {
                this.f117669a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.ss.android.ugc.aweme.find.viewholder.FindFriendsTailViewHolder */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Integer> list) {
                List<? extends Integer> list2 = list;
                C89219l.m154721d(iVar, "");
                C89219l.m154721d(list2, "");
                this.f117669a.mo86341a(list2);
                return C89391z.f203057a;
            }
        });
        withState(this.f117639a, new AbstractC89172b<FindFriendsState, C89391z>(this) {
            /* class com.p2082ss.android.ugc.aweme.find.viewholder.FindFriendsTailViewHolder.C510062 */

            /* renamed from: a */
            final /* synthetic */ FindFriendsTailViewHolder f117670a;

            static {
                Covode.recordClassIndex(60187);
            }

            {
                this.f117670a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(FindFriendsState findFriendsState) {
                FindFriendsState findFriendsState2 = findFriendsState;
                C89219l.m154721d(findFriendsState2, "");
                this.f117670a.mo86341a(findFriendsState2.getTailChannels());
                return C89391z.f203057a;
            }
        });
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.p2082ss.android.ugc.aweme.find.viewholder.FindFriendsTailViewHolder.View$OnAttachStateChangeListenerC510073 */

            /* renamed from: a */
            final /* synthetic */ FindFriendsTailViewHolder f117671a;

            static {
                Covode.recordClassIndex(60188);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f117671a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                int i = this.f117671a.f117667c;
                if (i == 0) {
                    C51488a.m95935c();
                } else if (i == 1) {
                    C51488a.m95931b("contact", this.f117671a.f117639a.f117700c, C51506b.m95979b());
                } else if (i == 2) {
                    C51488a.m95931b("facebook", this.f117671a.f117639a.f117700c, FindFriendsTailViewHolder.m95405a());
                }
            }
        });
    }
}
