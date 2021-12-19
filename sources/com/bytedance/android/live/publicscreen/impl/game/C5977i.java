package com.bytedance.android.live.publicscreen.impl.game;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3910b;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.publicscreen.impl.model.C6015e;
import com.bytedance.android.live.publicscreen.impl.model.chat.C5993b;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5865d;
import com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5862a;
import com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5863b;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.chatroom.p499ui.GameMsgLinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGameFloatMsgPanelConfigSetting;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.bytedance.android.live.publicscreen.impl.game.i */
public final class C5977i extends AbstractC5863b {

    /* renamed from: d */
    public static int f15008d;

    /* renamed from: e */
    public static final C5980a f15009e = new C5980a((byte) 0);

    /* renamed from: b */
    public final C5976h f15010b;

    /* renamed from: c */
    public int f15011c;

    /* renamed from: f */
    private C5972e f15012f;

    /* renamed from: g */
    private AbstractC88412b f15013g;

    /* renamed from: h */
    private final AbstractC89244h f15014h = C89250i.m154773a((AbstractC89171a) C5982c.f15026a);

    /* renamed from: i */
    private boolean f15015i;

    /* renamed from: j */
    private boolean f15016j;

    /* renamed from: k */
    private int f15017k;

    /* renamed from: l */
    private final ArrayList<Integer> f15018l;

    /* renamed from: m */
    private boolean f15019m;

    /* renamed from: n */
    private final Context f15020n;

    /* renamed from: o */
    private final AbstractC5862a f15021o;

    /* renamed from: p */
    private HashMap f15022p;

    static {
        Covode.recordClassIndex(6587);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5863b
    /* renamed from: a */
    public final View mo11660a(int i) {
        if (this.f15022p == null) {
            this.f15022p = new HashMap();
        }
        View view = (View) this.f15022p.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f15022p.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getMaxListSize() {
        return ((Number) this.f15014h.getValue()).intValue();
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.game.i$a */
    public static final class C5980a {
        static {
            Covode.recordClassIndex(6590);
        }

        private C5980a() {
        }

        public /* synthetic */ C5980a(byte b) {
            this();
        }
    }

    public final Context getActivity() {
        return this.f15020n;
    }

    public final AbstractC5862a getCallback() {
        return this.f15021o;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5863b
    public final int getState() {
        return this.f15017k;
    }

    /* renamed from: a */
    public final void mo11861a(boolean z, List<? extends AbstractC5877k<? extends AbstractC6571a>> list, boolean z2) {
        int size;
        if (z) {
            try {
                this.f15010b.f15005b.clear();
            } catch (Throwable unused) {
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if ((t2 instanceof C5993b) || (t2 instanceof C6015e)) {
                arrayList.add(t);
            }
        }
        this.f15010b.f15005b.addAll(list);
        C5976h hVar = this.f15010b;
        hVar.f15006c = hVar.f15005b.isEmpty() ? null : (AbstractC5873h) C89070n.m154586h((List) this.f15010b.f15005b);
        try {
            mo11862d();
            C5972e eVar = this.f15012f;
            if (eVar != null) {
                eVar.notifyDataSetChanged();
            }
        } catch (Exception unused2) {
            ((GameMsgRecyclerView) mo11660a(R.id.dgw)).getRecycledViewPool().clear();
            C5972e eVar2 = this.f15012f;
            if (eVar2 != null) {
                eVar2.notifyDataSetChanged();
            }
        } catch (Throwable unused3) {
        }
        int i = this.f15010b.f15007d;
        C5976h hVar2 = this.f15010b;
        hVar2.f15007d = hVar2.f15005b.size();
        if (getState() == 1 && i < this.f15010b.f15007d) {
            GameMsgRecyclerView gameMsgRecyclerView = (GameMsgRecyclerView) mo11660a(R.id.dgw);
            C89219l.m154716b(gameMsgRecyclerView, "");
            if (gameMsgRecyclerView.getMeasuredHeight() < ((int) C89393b.m154948a(154.0f))) {
                this.f15021o.mo8464c();
            }
        }
        m13092a(false);
        if (z2) {
            this.f15021o.mo8463b();
        }
        if (!C13603b.m24435a((Collection) this.f15010b.f15005b) && (size = this.f15010b.f15005b.size()) > 0 && !((GameMsgRecyclerView) mo11660a(R.id.dgw)).canScrollVertically(1)) {
            ((GameMsgRecyclerView) mo11660a(R.id.dgw)).mo4413b(size - 1);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5863b
    /* renamed from: a */
    public final boolean mo11662a() {
        if (this.f15011c != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5863b
    /* renamed from: c */
    public final void mo11664c() {
        AbstractC88412b bVar = this.f15013g;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.game.i$c */
    static final class C5982c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C5982c f15026a = new C5982c();

        static {
            Covode.recordClassIndex(6592);
        }

        C5982c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(LiveGameFloatMsgPanelConfigSetting.INSTANCE.getValue().f20387a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        AbstractC88412b bVar = this.f15013g;
        if (bVar != null) {
            bVar.dispose();
        }
        super.onDetachedFromWindow();
    }

    private final boolean getCollapsed() {
        if (getState() == 3 || getState() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5863b
    /* renamed from: b */
    public final void mo11663b() {
        C6805b<Boolean> bVar = AbstractC6804a.f16932ah;
        C89219l.m154716b(bVar, "");
        Boolean a = bVar.mo13066a();
        C6805b<Boolean> bVar2 = AbstractC6804a.f16933ai;
        C89219l.m154716b(bVar2, "");
        Boolean a2 = bVar2.mo13066a();
        if (!C89219l.m154714a(a, Boolean.valueOf(this.f15015i)) || !C89219l.m154714a(a2, Boolean.valueOf(this.f15016j))) {
            C89219l.m154716b(a, "");
            this.f15015i = a.booleanValue();
            C89219l.m154716b(a2, "");
            this.f15016j = a2.booleanValue();
            mo11861a(true, mo11860a(this.f15010b.f15004a), false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo11862d() {
        if (getCollapsed()) {
            EdgeTransparentView edgeTransparentView = (EdgeTransparentView) mo11660a(R.id.acp);
            C89219l.m154716b(edgeTransparentView, "");
            C89393b.m154949a(edgeTransparentView);
            if (mo11662a()) {
                if (getState() == 3) {
                    ((RelativeLayout) mo11660a(R.id.dlu)).setPadding((int) C89393b.m154948a(10.0f), (int) C89393b.m154948a(8.0f), (int) C89393b.m154948a(10.0f), (int) C89393b.m154948a(8.0f));
                } else {
                    ((RelativeLayout) mo11660a(R.id.dlu)).setPadding((int) C89393b.m154948a(10.0f), (int) C89393b.m154948a(4.0f), (int) C89393b.m154948a(10.0f), (int) C89393b.m154948a(4.0f));
                }
                RelativeLayout relativeLayout = (RelativeLayout) mo11660a(R.id.dlu);
                C89219l.m154716b(relativeLayout, "");
                C89393b.m154951c(relativeLayout);
                LiveTextView liveTextView = (LiveTextView) mo11660a(R.id.av5);
                C89219l.m154716b(liveTextView, "");
                C89393b.m154949a(liveTextView);
                View a = mo11660a(R.id.aie);
                C89219l.m154716b(a, "");
                C89393b.m154949a(a);
                View a2 = mo11660a(R.id.aia);
                C89219l.m154716b(a2, "");
                C89393b.m154949a(a2);
                View a3 = mo11660a(R.id.ai_);
                C89219l.m154716b(a3, "");
                C89393b.m154949a(a3);
                return;
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) mo11660a(R.id.dlu);
            C89219l.m154716b(relativeLayout2, "");
            C89393b.m154949a(relativeLayout2);
            AbstractC5873h hVar = this.f15010b.f15006c;
            if (hVar instanceof C5993b) {
                m13090a((C5993b) hVar);
            } else if (hVar instanceof C6015e) {
                m13091a((C6015e) hVar);
            } else {
                if (getState() == 2) {
                    LiveTextView liveTextView2 = (LiveTextView) mo11660a(R.id.av5);
                    C89219l.m154716b(liveTextView2, "");
                    C89393b.m154951c(liveTextView2);
                } else {
                    LiveTextView liveTextView3 = (LiveTextView) mo11660a(R.id.av5);
                    C89219l.m154716b(liveTextView3, "");
                    C89393b.m154949a(liveTextView3);
                }
                View a4 = mo11660a(R.id.aie);
                C89219l.m154716b(a4, "");
                C89393b.m154949a(a4);
                View a5 = mo11660a(R.id.aia);
                C89219l.m154716b(a5, "");
                C89393b.m154949a(a5);
                View a6 = mo11660a(R.id.ai_);
                C89219l.m154716b(a6, "");
                C89393b.m154949a(a6);
            }
        } else {
            if (mo11662a()) {
                ((RelativeLayout) mo11660a(R.id.dlu)).setPadding((int) C89393b.m154948a(10.0f), (int) C89393b.m154948a(4.0f), (int) C89393b.m154948a(10.0f), (int) C89393b.m154948a(4.0f));
                RelativeLayout relativeLayout3 = (RelativeLayout) mo11660a(R.id.dlu);
                C89219l.m154716b(relativeLayout3, "");
                C89393b.m154951c(relativeLayout3);
                EdgeTransparentView edgeTransparentView2 = (EdgeTransparentView) mo11660a(R.id.acp);
                C89219l.m154716b(edgeTransparentView2, "");
                ViewGroup.LayoutParams layoutParams = edgeTransparentView2.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ((LinearLayout.LayoutParams) layoutParams).setMargins(0, 0, 0, (int) C89393b.m154948a(8.0f));
            } else {
                RelativeLayout relativeLayout4 = (RelativeLayout) mo11660a(R.id.dlu);
                C89219l.m154716b(relativeLayout4, "");
                C89393b.m154949a(relativeLayout4);
                EdgeTransparentView edgeTransparentView3 = (EdgeTransparentView) mo11660a(R.id.acp);
                C89219l.m154716b(edgeTransparentView3, "");
                ViewGroup.LayoutParams layoutParams2 = edgeTransparentView3.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ((LinearLayout.LayoutParams) layoutParams2).setMargins(0, (int) C89393b.m154948a(8.0f), 0, (int) C89393b.m154948a(8.0f));
            }
            EdgeTransparentView edgeTransparentView4 = (EdgeTransparentView) mo11660a(R.id.acp);
            C89219l.m154716b(edgeTransparentView4, "");
            C89393b.m154951c(edgeTransparentView4);
            LiveTextView liveTextView4 = (LiveTextView) mo11660a(R.id.av5);
            C89219l.m154716b(liveTextView4, "");
            C89393b.m154949a(liveTextView4);
            View a7 = mo11660a(R.id.aie);
            C89219l.m154716b(a7, "");
            C89393b.m154949a(a7);
            View a8 = mo11660a(R.id.aia);
            C89219l.m154716b(a8, "");
            C89393b.m154949a(a8);
            View a9 = mo11660a(R.id.ai_);
            C89219l.m154716b(a9, "");
            C89393b.m154949a(a9);
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.game.i$b */
    static final class C5981b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5977i f15025a;

        static {
            Covode.recordClassIndex(6591);
        }

        C5981b(C5977i iVar) {
            this.f15025a = iVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<? extends AbstractC5877k<? extends AbstractC6571a>> list = (List) obj;
            LiveTextView liveTextView = (LiveTextView) this.f15025a.mo11660a(R.id.eue);
            C89219l.m154716b(liveTextView, "");
            liveTextView.setText(C3966y.m9660a((int) R.string.gl9, C3910b.m9544b((long) C5977i.f15008d)));
            if (list != null && !list.isEmpty()) {
                this.f15025a.f15010b.f15004a.addAll(list);
                int size = this.f15025a.f15010b.f15004a.size() - this.f15025a.getMaxListSize();
                if (size > 0) {
                    this.f15025a.f15010b.f15004a.subList(0, size).clear();
                    C5977i iVar = this.f15025a;
                    iVar.mo11861a(true, iVar.mo11860a(iVar.f15010b.f15004a), true);
                    return;
                }
                C5977i iVar2 = this.f15025a;
                iVar2.mo11861a(false, iVar2.mo11860a(list), true);
            }
        }
    }

    /* renamed from: a */
    private final void m13090a(C5993b bVar) {
        ImageModel imageModel;
        LiveTextView liveTextView = (LiveTextView) mo11660a(R.id.av5);
        C89219l.m154716b(liveTextView, "");
        C89393b.m154949a(liveTextView);
        View a = mo11660a(R.id.aie);
        C89219l.m154716b(a, "");
        C89393b.m154949a(a);
        View a2 = mo11660a(R.id.aia);
        C89219l.m154716b(a2, "");
        C89393b.m154949a(a2);
        View a3 = mo11660a(R.id.ai_);
        C89219l.m154716b(a3, "");
        C89393b.m154951c(a3);
        LiveTextView liveTextView2 = (LiveTextView) mo11660a(R.id.fa1);
        C89219l.m154716b(liveTextView2, "");
        liveTextView2.setText(bVar.mo11871v());
        HSImageView hSImageView = (HSImageView) mo11660a(R.id.f__);
        User b = bVar.mo10375b();
        if (b != null) {
            imageModel = b.getAvatarThumb();
        } else {
            imageModel = null;
        }
        C3941k.m9601a(hSImageView, imageModel);
        LiveTextView liveTextView3 = (LiveTextView) mo11660a(R.id.a48);
        C89219l.m154716b(liveTextView3, "");
        liveTextView3.setText(bVar.mo11710z());
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5863b
    public final void setState(int i) {
        if (i != this.f15017k) {
            this.f15017k = i;
            if (i == 1) {
                mo11862d();
                RelativeLayout relativeLayout = (RelativeLayout) mo11660a(R.id.qn);
                C89219l.m154716b(relativeLayout, "");
                C89393b.m154951c(relativeLayout);
            } else if (i == 2) {
                mo11862d();
                RelativeLayout relativeLayout2 = (RelativeLayout) mo11660a(R.id.qn);
                C89219l.m154716b(relativeLayout2, "");
                C89393b.m154951c(relativeLayout2);
            } else if (i == 3) {
                RelativeLayout relativeLayout3 = (RelativeLayout) mo11660a(R.id.qn);
                C89219l.m154716b(relativeLayout3, "");
                C89393b.m154949a(relativeLayout3);
                mo11862d();
            }
            m13092a(true);
            this.f15021o.mo8462a(getState());
        }
    }

    /* renamed from: a */
    private final void m13091a(C6015e eVar) {
        LiveTextView liveTextView = (LiveTextView) mo11660a(R.id.av5);
        C89219l.m154716b(liveTextView, "");
        C89393b.m154949a(liveTextView);
        View a = mo11660a(R.id.ai_);
        C89219l.m154716b(a, "");
        C89393b.m154949a(a);
        View a2 = mo11660a(R.id.aie);
        C89219l.m154716b(a2, "");
        C89393b.m154949a(a2);
        View a3 = mo11660a(R.id.aia);
        C89219l.m154716b(a3, "");
        C89393b.m154951c(a3);
        LiveTextView liveTextView2 = (LiveTextView) mo11660a(R.id.baa);
        C89219l.m154716b(liveTextView2, "");
        C5974f.m13088a(liveTextView2, eVar);
    }

    /* renamed from: a */
    private final void m13092a(boolean z) {
        if (z) {
            int state = getState();
            if (state == 1) {
                ImageView imageView = (ImageView) mo11660a(R.id.bsj);
                C89219l.m154716b(imageView, "");
                C89393b.m154951c(imageView);
                ((ImageView) mo11660a(R.id.bsj)).setImageResource(2131234453);
            } else if (state == 2) {
                ((ImageView) mo11660a(R.id.bsj)).setImageResource(2131234452);
                if (this.f15010b.f15005b.size() > 1) {
                    ImageView imageView2 = (ImageView) mo11660a(R.id.bsj);
                    C89219l.m154716b(imageView2, "");
                    C89393b.m154951c(imageView2);
                    return;
                }
                ImageView imageView3 = (ImageView) mo11660a(R.id.bsj);
                C89219l.m154716b(imageView3, "");
                C89393b.m154950b(imageView3);
            } else if (state == 3) {
                ImageView imageView4 = (ImageView) mo11660a(R.id.bsj);
                C89219l.m154716b(imageView4, "");
                C89393b.m154950b(imageView4);
            }
        } else if (this.f15010b.f15005b.size() <= 1 || getState() == 3) {
            ImageView imageView5 = (ImageView) mo11660a(R.id.bsj);
            C89219l.m154716b(imageView5, "");
            C89393b.m154950b(imageView5);
        } else {
            ImageView imageView6 = (ImageView) mo11660a(R.id.bsj);
            C89219l.m154716b(imageView6, "");
            C89393b.m154951c(imageView6);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.List<? extends com.bytedance.android.live.publicscreen.a.d.k<? extends com.bytedance.android.livesdk.ab.b.a>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final List<AbstractC5877k<? extends AbstractC6571a>> mo11860a(List<? extends AbstractC5877k<? extends AbstractC6571a>> list) {
        C6805b<Boolean> bVar = AbstractC6804a.f16932ah;
        C89219l.m154716b(bVar, "");
        Boolean a = bVar.mo13066a();
        C6805b<Boolean> bVar2 = AbstractC6804a.f16933ai;
        C89219l.m154716b(bVar2, "");
        Boolean a2 = bVar2.mo13066a();
        C89219l.m154716b(a, "");
        if (a.booleanValue()) {
            C89219l.m154716b(a2, "");
            if (a2.booleanValue()) {
                return list;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5877k kVar = (AbstractC5877k) it.next();
            int intType = kVar.f14737d.getIntType();
            if ((a.booleanValue() || intType == EnumC9596a.GIFT.getIntType() || intType == EnumC9596a.DOODLE_GIFT.getIntType()) && ((a2.booleanValue() || !(intType == EnumC9596a.GIFT.getIntType() || intType == EnumC9596a.DOODLE_GIFT.getIntType())) && this.f15018l.contains(Integer.valueOf(intType)))) {
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5863b
    /* renamed from: a */
    public final void mo11661a(AbstractC5865d dVar) {
        C89219l.m154721d(dVar, "");
        if (this.f15019m) {
            C3854a.m9453a(6, "LiveGameMsgView", "bindTextPresenter already binded");
            return;
        }
        AbstractC88979t<List<AbstractC5877k<? extends AbstractC6571a>>> a = dVar.mo11667a();
        if (a == null) {
            C3854a.m9453a(6, "LiveGameMsgView", "bindTextPresenter observeFloatWindowMsgList return null");
            return;
        }
        this.f15019m = true;
        this.f15013g = a.mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C5981b(this), C11195i.f26823a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5977i(Context context, int i, AbstractC5862a aVar) {
        super(context, i);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        MethodCollector.m26663i(5504);
        this.f15020n = context;
        this.f15021o = aVar;
        C6805b<Boolean> bVar = AbstractC6804a.f16932ah;
        C89219l.m154716b(bVar, "");
        Boolean a = bVar.mo13066a();
        C89219l.m154716b(a, "");
        this.f15015i = a.booleanValue();
        C6805b<Boolean> bVar2 = AbstractC6804a.f16933ai;
        C89219l.m154716b(bVar2, "");
        Boolean a2 = bVar2.mo13066a();
        C89219l.m154716b(a2, "");
        this.f15016j = a2.booleanValue();
        C5976h hVar = new C5976h();
        this.f15010b = hVar;
        this.f15017k = i;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(EnumC9596a.GIFT.getIntType()));
        arrayList.add(Integer.valueOf(EnumC9596a.DOODLE_GIFT.getIntType()));
        arrayList.add(Integer.valueOf(EnumC9596a.CHAT.getIntType()));
        arrayList.add(Integer.valueOf(EnumC9596a.MEMBER.getIntType()));
        arrayList.add(Integer.valueOf(EnumC9596a.SCREEN.getIntType()));
        this.f15018l = arrayList;
        View.inflate(context, R.layout.bdx, this);
        f15008d = 0;
        ((ImageView) mo11660a(R.id.bsj)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.android.live.publicscreen.impl.game.C5977i.View$OnClickListenerC59781 */

            /* renamed from: a */
            final /* synthetic */ C5977i f15023a;

            static {
                Covode.recordClassIndex(6588);
            }

            {
                this.f15023a = r1;
            }

            public final void onClick(View view) {
                int state = this.f15023a.getState();
                if (state == 1) {
                    this.f15023a.setState(2);
                } else if (state == 2) {
                    this.f15023a.setState(1);
                } else if (state == 3) {
                    ImageView imageView = (ImageView) this.f15023a.mo11660a(R.id.bsj);
                    C89219l.m154716b(imageView, "");
                    C89393b.m154950b(imageView);
                }
            }
        });
        setState(i);
        mo11862d();
        m13092a(true);
        EdgeTransparentView edgeTransparentView = (EdgeTransparentView) mo11660a(R.id.acp);
        float a3 = C89393b.m154948a(20.0f);
        edgeTransparentView.f14984a = 1;
        edgeTransparentView.f14985b = a3;
        edgeTransparentView.invalidate();
        this.f15012f = new C5972e(context, hVar.f15005b);
        GameMsgLinearLayoutManager gameMsgLinearLayoutManager = new GameMsgLinearLayoutManager();
        ((GameMsgRecyclerView) mo11660a(R.id.dgw)).setMaxHeight((int) C89393b.m154948a(154.0f));
        RecyclerView recyclerView = (RecyclerView) mo11660a(R.id.dgw);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setLayoutManager(gameMsgLinearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) mo11660a(R.id.dgw);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setItemAnimator(null);
        RecyclerView recyclerView3 = (RecyclerView) mo11660a(R.id.dgw);
        C89219l.m154716b(recyclerView3, "");
        recyclerView3.setAdapter(this.f15012f);
        ((LiveTextView) mo11660a(R.id.f2e)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.android.live.publicscreen.impl.game.C5977i.View$OnClickListenerC59792 */

            /* renamed from: a */
            final /* synthetic */ C5977i f15024a;

            static {
                Covode.recordClassIndex(6589);
            }

            {
                this.f15024a = r1;
            }

            public final void onClick(View view) {
                this.f15024a.getCallback().mo8461a();
                C5977i iVar = this.f15024a;
                if (iVar.f15011c == iVar.f15011c) {
                    iVar.f15011c = 0;
                    iVar.mo11862d();
                }
            }
        });
        LiveTextView liveTextView = (LiveTextView) mo11660a(R.id.eue);
        C89219l.m154716b(liveTextView, "");
        liveTextView.setText(C3966y.m9660a((int) R.string.gl9, C3910b.m9544b((long) f15008d)));
        MethodCollector.m26664o(5504);
    }
}
