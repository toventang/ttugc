package com.bytedance.android.live.liveinteract.multiguest.opt.p339b.p340a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.C5300c;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p317a.C5123a;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.C5234j;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.DialogC5211a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5712g;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.chatroom.p499ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p562k.DialogC9146a;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.widget.AbstractDialogC11425g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.b.a.b */
public final class DialogC5350b extends AbstractDialogC11425g implements C5189g.AbstractC5190a {
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: a */
    public C5271a f13828a;

    /* renamed from: b */
    public final C5123a f13829b;

    /* renamed from: c */
    public final C5300c f13830c;

    /* renamed from: d */
    private TextView f13831d;

    /* renamed from: e */
    private TextView f13832e;

    /* renamed from: f */
    private RecyclerView f13833f;

    /* renamed from: g */
    private View f13834g;

    /* renamed from: h */
    private final AbstractC89244h f13835h;

    /* renamed from: j */
    private DialogC9148b f13836j;

    static {
        Covode.recordClassIndex(5942);
    }

    /* renamed from: h */
    private final DialogC9146a m11815h() {
        return (DialogC9146a) this.f13835h.getValue();
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC11425g
    /* renamed from: b */
    public final int mo8350b() {
        return R.layout.b69;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.b.a.b$a */
    static final class C5351a extends AbstractC89220m implements AbstractC89171a<DialogC9146a> {

        /* renamed from: a */
        final /* synthetic */ Context f13837a;

        static {
            Covode.recordClassIndex(5943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5351a(Context context) {
            super(0);
            this.f13837a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC9146a invoke() {
            DialogC9146a.C9147a aVar = new DialogC9146a.C9147a(this.f13837a);
            aVar.f22148c = false;
            return aVar.mo15240a();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5190a
    /* renamed from: a */
    public final void mo10956a() {
        m11816i();
        if (isShowing()) {
            dismiss();
        }
    }

    /* renamed from: d */
    public final C5271a mo11180d() {
        C5271a aVar = this.f13828a;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        return aVar;
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC11425g
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13830c.f13744l = null;
        m11816i();
    }

    /* renamed from: i */
    private final void m11816i() {
        if (m11815h().isShowing()) {
            m11815h().dismiss();
        }
    }

    public final void dismiss() {
        DialogC9148b bVar;
        super.dismiss();
        DialogC9148b bVar2 = this.f13836j;
        if (!(bVar2 == null || !bVar2.isShowing() || (bVar = this.f13836j) == null)) {
            bVar.dismiss();
        }
        m11816i();
    }

    /* renamed from: g */
    public final void mo11184g() {
        if (!m11815h().isShowing()) {
            m11815h().show();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5190a
    /* renamed from: c */
    public final void mo10957c() {
        String str;
        Resources resources;
        m11816i();
        TextView textView = this.f13831d;
        if (textView == null) {
            C89219l.m154710a("mActionButton");
        }
        Context context = getContext();
        C89219l.m154716b(context, "");
        textView.setTextColor(context.getResources().getColor(R.color.wk));
        TextView textView2 = this.f13831d;
        if (textView2 == null) {
            C89219l.m154710a("mActionButton");
        }
        textView2.setText(C3966y.m9657a((int) R.string.dv0));
        TextView textView3 = this.f13831d;
        if (textView3 == null) {
            C89219l.m154710a("mActionButton");
        }
        textView3.setBackgroundResource(R.drawable.brr);
        C5123a aVar = this.f13829b;
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        aVar.mo10852a(b.mo13161c());
        if (this.f13829b.getItemCount() > 0) {
            View view = this.f13834g;
            if (view == null) {
                C89219l.m154710a("mEmptyView");
            }
            view.setVisibility(8);
            RecyclerView recyclerView = this.f13833f;
            if (recyclerView == null) {
                C89219l.m154710a("mRecyclerView");
            }
            recyclerView.setVisibility(0);
        } else {
            View view2 = this.f13834g;
            if (view2 == null) {
                C89219l.m154710a("mEmptyView");
            }
            view2.setVisibility(0);
            RecyclerView recyclerView2 = this.f13833f;
            if (recyclerView2 == null) {
                C89219l.m154710a("mRecyclerView");
            }
            recyclerView2.setVisibility(8);
        }
        TextView textView4 = this.f13832e;
        if (textView4 == null) {
            C89219l.m154710a("mTitleView");
        }
        TextView textView5 = this.f13832e;
        if (textView5 == null) {
            C89219l.m154710a("mTitleView");
        }
        Context context2 = textView5.getContext();
        if (context2 == null || (resources = context2.getResources()) == null || (str = resources.getQuantityString(R.plurals.fl, this.f13829b.getItemCount(), Integer.valueOf(this.f13829b.getItemCount()))) == null) {
            str = "";
        }
        textView4.setText(str);
        if (isShowing()) {
            dismiss();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11182e() {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.opt.p339b.p340a.DialogC5350b.mo11182e():void");
    }

    /* renamed from: f */
    public final void mo11183f() {
        DialogC9148b bVar;
        DialogC9148b bVar2;
        if (this.f27387i) {
            C4386c a = C4386c.m10499a();
            C89219l.m154716b(a, "");
            T t = a.f17248n;
            if (t != null) {
                if (t.intValue() == 2) {
                    DialogC9148b bVar3 = this.f13836j;
                    if (!(bVar3 == null || !bVar3.isShowing() || (bVar2 = this.f13836j) == null)) {
                        bVar2.dismiss();
                    }
                    DialogC9148b a2 = new DialogC9148b.C9149a(getContext()).mo15243a(R.string.dyp).mo15248b(R.string.efq).mo15244a(R.string.dyo, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC5352b(this), false).mo15249b(R.string.gi8, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC5353c.f13839a, false).mo15247a();
                    this.f13836j = a2;
                    if (a2 != null) {
                        a2.show();
                        return;
                    }
                    return;
                } else if (t.intValue() == 1) {
                    DialogC9148b bVar4 = this.f13836j;
                    if (!(bVar4 == null || !bVar4.isShowing() || (bVar = this.f13836j) == null)) {
                        bVar.dismiss();
                    }
                    DialogC9148b a3 = new DialogC9148b.C9149a(getContext()).mo15243a(R.string.eob).mo15248b(R.string.eoc).mo15244a(R.string.eoa, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC5354d(this), false).mo15249b(R.string.efr, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC5355e.f13841a, false).mo15247a();
                    this.f13836j = a3;
                    if (a3 != null) {
                        a3.show();
                        return;
                    }
                    return;
                }
            }
            dismiss();
            C5189g.AbstractC5191b bVar5 = (C5189g.AbstractC5191b) this.f13830c.f38654y;
            if (bVar5 != null) {
                bVar5.mo10961a(DialogC5211a.EnumC5215a.SEND_REQUEST);
            }
            this.f13830c.mo11143a(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.b.a.b$f */
    public static final class View$OnClickListenerC5356f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC5350b f13842a;

        static {
            Covode.recordClassIndex(5948);
        }

        View$OnClickListenerC5356f(DialogC5350b bVar) {
            this.f13842a = bVar;
        }

        public final void onClick(View view) {
            this.f13842a.mo11183f();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5190a
    /* renamed from: c */
    public final void mo10958c(Throwable th) {
        m11816i();
        C11264f.m19958a(getContext(), th, (int) R.string.goi);
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC11425g
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(R.id.dgw);
        C89219l.m154716b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f13833f = recyclerView;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView.mo4402a(new C5234j());
        RecyclerView recyclerView2 = this.f13833f;
        if (recyclerView2 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        getContext();
        recyclerView2.setLayoutManager(new SSLinearLayoutManager(0));
        RecyclerView recyclerView3 = this.f13833f;
        if (recyclerView3 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView3.setAdapter(this.f13829b);
        View findViewById2 = findViewById(R.id.title);
        C89219l.m154716b(findViewById2, "");
        this.f13832e = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.c4);
        C89219l.m154716b(findViewById3, "");
        this.f13831d = (TextView) findViewById3;
        mo11182e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.b.a.b$c */
    public static final class DialogInterface$OnClickListenerC5353c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC5353c f13839a = new DialogInterface$OnClickListenerC5353c();

        static {
            Covode.recordClassIndex(5945);
        }

        DialogInterface$OnClickListenerC5353c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.b.a.b$e */
    public static final class DialogInterface$OnClickListenerC5355e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC5355e f13841a = new DialogInterface$OnClickListenerC5355e();

        static {
            Covode.recordClassIndex(5947);
        }

        DialogInterface$OnClickListenerC5355e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.b.a.b$b */
    public static final class DialogInterface$OnClickListenerC5352b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC5350b f13838a;

        static {
            Covode.recordClassIndex(5944);
        }

        DialogInterface$OnClickListenerC5352b(DialogC5350b bVar) {
            this.f13838a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
            this.f13838a.f13830c.mo11154f("leave_normally");
            this.f13838a.mo11184g();
            C5712g.m12498a("guest_over", this.f13838a.mo11180d().f13646q);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.b.a.b$d */
    public static final class DialogInterface$OnClickListenerC5354d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC5350b f13840a;

        static {
            Covode.recordClassIndex(5946);
        }

        DialogInterface$OnClickListenerC5354d(DialogC5350b bVar) {
            this.f13840a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
            this.f13840a.f13830c.mo11155g("leave_source_user_click_cancel");
            this.f13840a.mo11184g();
            C5703b.m12459a(this.f13840a.mo11180d().f13646q);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC5350b(Context context, C5300c cVar, List<C7666e> list) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(list, "");
        this.f13830c = cVar;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (t2.f19003e == 1 && t2.f19005g == 2) {
                arrayList.add(t);
            }
        }
        this.f13829b = new C5123a(null, arrayList, 1);
        this.f13835h = C89250i.m154773a((AbstractC89171a) new C5351a(context));
        this.f13830c.f13744l = this;
        C4431e.f12034a.mo10201a(this);
    }
}
