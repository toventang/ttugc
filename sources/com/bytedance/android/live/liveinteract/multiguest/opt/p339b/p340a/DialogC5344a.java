package com.bytedance.android.live.liveinteract.multiguest.opt.p339b.p340a;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3933f;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.AbstractC5276a;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.C5277b;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p317a.C5123a;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.C5234j;
import com.bytedance.android.live.liveinteract.multilive.anchor.p354e.C5517c;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5720o;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.chatroom.p499ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p562k.DialogC9146a;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.widget.AbstractDialogC11425g;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a */
public class DialogC5344a extends AbstractDialogC11425g implements CompoundButton.OnCheckedChangeListener, C5123a.AbstractC5127b, AbstractC5276a {

    /* renamed from: a */
    public final C5123a f13814a;

    /* renamed from: b */
    public final C5277b f13815b;

    /* renamed from: c */
    private TextView f13816c;

    /* renamed from: d */
    private TextView f13817d;

    /* renamed from: e */
    private View f13818e;

    /* renamed from: f */
    private RecyclerView f13819f;

    /* renamed from: g */
    private SwitchCompat f13820g;

    /* renamed from: h */
    private final AbstractC89244h f13821h;

    static {
        Covode.recordClassIndex(5936);
    }

    /* renamed from: f */
    private final DialogC9146a mo11360f() {
        return (DialogC9146a) this.f13821h.getValue();
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC11425g
    /* renamed from: b */
    public int mo8350b() {
        return R.layout.b68;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.AbstractC5276a
    /* renamed from: c */
    public final void mo11121c(long j) {
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.AbstractC5276a
    /* renamed from: d */
    public final void mo11122d(long j) {
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a$c */
    static final class C5347c extends AbstractC89220m implements AbstractC89171a<DialogC9146a> {

        /* renamed from: a */
        final /* synthetic */ Context f13825a;

        static {
            Covode.recordClassIndex(5939);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5347c(Context context) {
            super(0);
            this.f13825a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC9146a invoke() {
            DialogC9146a.C9147a aVar = new DialogC9146a.C9147a(this.f13825a);
            aVar.f22148c = false;
            return aVar.mo15240a();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.AbstractC5276a
    /* renamed from: a */
    public final void mo11115a() {
        mo11173e();
        if (isShowing()) {
            dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC11425g
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13815b.f13662c = null;
        mo11173e();
    }

    /* renamed from: e */
    public final void mo11173e() {
        if (mo11360f().isShowing()) {
            mo11360f().dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.AbstractC5276a
    /* renamed from: c */
    public final void mo11120c() {
        mo11173e();
        SwitchCompat switchCompat = this.f13820g;
        if (switchCompat == null) {
            C89219l.m154710a("mSwitch");
        }
        switchCompat.setOnCheckedChangeListener(null);
        SwitchCompat switchCompat2 = this.f13820g;
        if (switchCompat2 == null) {
            C89219l.m154710a("mSwitch");
        }
        switchCompat2.setChecked(true);
        SwitchCompat switchCompat3 = this.f13820g;
        if (switchCompat3 == null) {
            C89219l.m154710a("mSwitch");
        }
        switchCompat3.setOnCheckedChangeListener(this);
        C11226ao.m19882a(getContext(), (int) R.string.gop);
    }

    /* renamed from: d */
    public final void mo11172d() {
        int b = this.f13814a.mo10854b();
        TextView textView = this.f13816c;
        if (textView == null) {
            C89219l.m154710a("mTitleView");
        }
        Context context = getContext();
        C89219l.m154716b(context, "");
        textView.setText(context.getResources().getQuantityString(R.plurals.fm, b, Integer.valueOf(b)));
        int a = C6894d.m14753a().f17275v - this.f13814a.mo10851a();
        if (a < 0) {
            a = 0;
        }
        TextView textView2 = this.f13817d;
        if (textView2 == null) {
            C89219l.m154710a("mDescriptionView");
        }
        textView2.setText(C3933f.m9582a(R.string.e3a, Integer.valueOf(a)));
        if (this.f13814a.getItemCount() > 0) {
            View view = this.f13818e;
            if (view == null) {
                C89219l.m154710a("mEmptyView");
            }
            view.setVisibility(8);
            RecyclerView recyclerView = this.f13819f;
            if (recyclerView == null) {
                C89219l.m154710a("mRecyclerView");
            }
            recyclerView.setVisibility(0);
            return;
        }
        View view2 = this.f13818e;
        if (view2 == null) {
            C89219l.m154710a("mEmptyView");
        }
        view2.setVisibility(0);
        RecyclerView recyclerView2 = this.f13819f;
        if (recyclerView2 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView2.setVisibility(8);
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC11425g
    public void onCreate(Bundle bundle) {
        mo11171a(bundle, null);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.AbstractC5276a
    /* renamed from: b */
    public final void mo11118b(long j) {
        if (this.f27387i) {
            this.f13814a.mo10852a(j);
            mo11172d();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.AbstractC5276a
    /* renamed from: b */
    public final void mo11119b(Throwable th) {
        if (this.f27387i) {
            C11264f.m19958a(getContext(), th, (int) R.string.goc);
        }
    }

    /* renamed from: a */
    public static List<C7666e> m11798a(List<C7666e> list) {
        List f;
        if (list == null || (f = C89070n.m154580f((Iterable) list)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : f) {
            C7666e eVar = (C7666e) obj;
            if (eVar.f19005g == 2 || (eVar.f19003e == 2 && eVar.f19005g == 3)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo11170a(int i) {
        mo11360f().mo15238a(getContext().getString(i));
        if (!mo11360f().isShowing()) {
            mo11360f().show();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.AbstractC5276a
    /* renamed from: a */
    public final void mo11116a(long j) {
        if (this.f27387i) {
            mo11173e();
            C5123a aVar = this.f13814a;
            int size = aVar.f13300b.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    C7666e eVar = aVar.f13300b.get(i);
                    if (eVar != null && eVar.f19001c != null && eVar.f19001c.getId() == j) {
                        eVar.f19003e = 2;
                        eVar.f19002d = System.currentTimeMillis() / 1000;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            aVar.notifyItemChanged(i);
            mo11172d();
            if (isShowing()) {
                dismiss();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p317a.C5123a.AbstractC5127b
    /* renamed from: a */
    public final void mo10859a(User user) {
        C89219l.m154721d(user, "");
        if (this.f27387i) {
            String a = C3966y.m9660a((int) R.string.dyw, user.displayId);
            DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(getContext());
            aVar.f22244a = a;
            aVar.mo15248b(R.string.dyx).mo15244a(R.string.efw, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC5345a(this, user), false).mo15249b(R.string.eg2, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC5346b.f13824a, false).mo15247a().show();
            C5714i.m12558c();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.AbstractC5276a
    /* renamed from: a */
    public final void mo11117a(Throwable th) {
        mo11173e();
        if (this.f27387i) {
            C11264f.m19958a(getContext(), th, (int) R.string.god);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a$b */
    static final class DialogInterface$OnClickListenerC5346b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC5346b f13824a = new DialogInterface$OnClickListenerC5346b();

        static {
            Covode.recordClassIndex(5938);
        }

        DialogInterface$OnClickListenerC5346b() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C5714i.m12527a(0);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a$e */
    static final class DialogInterface$OnClickListenerC5349e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CompoundButton f13827a;

        static {
            Covode.recordClassIndex(5941);
        }

        DialogInterface$OnClickListenerC5349e(CompoundButton compoundButton) {
            this.f13827a = compoundButton;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            CompoundButton compoundButton = this.f13827a;
            if (compoundButton == null) {
                C89219l.m154715b();
            }
            compoundButton.setChecked(true);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a$a */
    static final class DialogInterface$OnClickListenerC5345a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC5344a f13822a;

        /* renamed from: b */
        final /* synthetic */ User f13823b;

        static {
            Covode.recordClassIndex(5937);
        }

        DialogInterface$OnClickListenerC5345a(DialogC5344a aVar, User user) {
            this.f13822a = aVar;
            this.f13823b = user;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str = "";
            C89219l.m154721d(dialogInterface, str);
            C5714i.m12527a(1);
            dialogInterface.dismiss();
            C5277b bVar = this.f13822a.f13815b;
            long id = this.f13823b.getId();
            String secUid = this.f13823b.getSecUid();
            if (secUid != null) {
                str = secUid;
            }
            bVar.mo11125a(id, str, "kickout_with_popup_confirm");
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a$d */
    static final class DialogInterface$OnClickListenerC5348d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC5344a f13826a;

        static {
            Covode.recordClassIndex(5940);
        }

        DialogInterface$OnClickListenerC5348d(DialogC5344a aVar) {
            this.f13826a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
            this.f13826a.mo11170a(R.string.go6);
            this.f13826a.f13815b.mo11129a(LinkApi.EnumC7285c.USER_CLICK, PrivacyCert.Builder.Companion.with("bpea-527").usage("").tag("turn off guest requests").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            C5703b.m12480d("manual_close");
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!z) {
            if (!C5517c.m12023a()) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.eeu);
            } else if (this.f13814a.getItemCount() <= 0) {
                mo11170a(R.string.go6);
                this.f13815b.mo11129a(LinkApi.EnumC7285c.USER_CLICK, PrivacyCert.Builder.Companion.with("bpea-526").usage("").tag("finish link mic").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                C5703b.m12480d("manual_close");
            } else {
                DialogC9148b.C9149a b = new DialogC9148b.C9149a(getContext()).mo15243a(R.string.em4).mo15248b(R.string.em5).mo15244a(R.string.em3, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC5348d(this), false).mo15249b(R.string.eg2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC5349e(compoundButton), false);
                b.f22256m = false;
                b.mo15247a().show();
            }
        }
    }

    /* renamed from: a */
    public final void mo11171a(Bundle bundle, EnumC4422k kVar) {
        super.onCreate(bundle);
        View findViewById = findViewById(R.id.dgw);
        C89219l.m154716b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f13819f = recyclerView;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView.mo4402a(new C5234j());
        RecyclerView recyclerView2 = this.f13819f;
        if (recyclerView2 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        getContext();
        recyclerView2.setLayoutManager(new SSLinearLayoutManager(0));
        RecyclerView recyclerView3 = this.f13819f;
        if (recyclerView3 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView3.setAdapter(this.f13814a);
        View findViewById2 = findViewById(R.id.ek1);
        C89219l.m154716b(findViewById2, "");
        SwitchCompat switchCompat = (SwitchCompat) findViewById2;
        this.f13820g = switchCompat;
        if (switchCompat == null) {
            C89219l.m154710a("mSwitch");
        }
        switchCompat.setOnCheckedChangeListener(this);
        View findViewById3 = findViewById(R.id.title);
        C89219l.m154716b(findViewById3, "");
        this.f13816c = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.ajt);
        C89219l.m154716b(findViewById4, "");
        this.f13817d = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.auq);
        C89219l.m154716b(findViewById5, "");
        this.f13818e = findViewById5;
        mo11172d();
        C5720o.m12573a(this.f13814a.mo10854b(), kVar);
        this.f13814a.mo10855c();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p317a.C5123a.AbstractC5127b
    /* renamed from: a */
    public final void mo10858a(long j, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (this.f27387i) {
            mo11170a(R.string.goe);
            this.f13815b.mo11126a(j, str, str2, 1, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC5344a(Context context, C5277b bVar, List<C7666e> list) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        this.f13815b = bVar;
        this.f13821h = C89250i.m154773a((AbstractC89171a) new C5347c(context));
        this.f13814a = new C5123a(this, m11798a(list), 0);
        bVar.f13662c = this;
    }
}
