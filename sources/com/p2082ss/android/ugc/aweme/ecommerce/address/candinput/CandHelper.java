package com.p2082ss.android.ugc.aweme.ecommerce.address.candinput;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43367c;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43368d;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43369e;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43371g;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43377m;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.C43478j;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper */
public final class CandHelper {

    /* renamed from: h */
    static final int f101154h;

    /* renamed from: i */
    static final int f101155i;

    /* renamed from: j */
    public static final C43342a f101156j = new C43342a((byte) 0);

    /* renamed from: m */
    private static final int f101157m = 1;

    /* renamed from: a */
    PopupWindow f101158a;

    /* renamed from: b */
    public C43348a f101159b;

    /* renamed from: c */
    public int f101160c = 1;

    /* renamed from: d */
    public String f101161d = "";

    /* renamed from: e */
    public String f101162e = "";

    /* renamed from: f */
    public final Context f101163f;

    /* renamed from: g */
    public final EditText f101164g;

    /* renamed from: k */
    private RecyclerView f101165k;

    /* renamed from: l */
    private final HandlerC43343b f101166l = new HandlerC43343b(this, Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper$a */
    public static final class C43342a {
        static {
            Covode.recordClassIndex(51562);
        }

        private C43342a() {
        }

        public /* synthetic */ C43342a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper$d */
    static final class RunnableC43346d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CandHelper f101172a;

        /* renamed from: b */
        final /* synthetic */ AddressEditViewModel f101173b;

        /* renamed from: c */
        final /* synthetic */ String f101174c;

        /* renamed from: d */
        final /* synthetic */ EditText f101175d;

        static {
            Covode.recordClassIndex(51566);
        }

        RunnableC43346d(CandHelper candHelper, AddressEditViewModel addressEditViewModel, String str, EditText editText) {
            this.f101172a = candHelper;
            this.f101173b = addressEditViewModel;
            this.f101174c = str;
            this.f101175d = editText;
        }

        public final void run() {
            AddressEditViewModel addressEditViewModel = this.f101173b;
            String str = this.f101174c;
            C433471 r1 = new AbstractC89172b<C43369e, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper.RunnableC43346d.C433471 */

                /* renamed from: a */
                final /* synthetic */ RunnableC43346d f101176a;

                static {
                    Covode.recordClassIndex(51567);
                }

                {
                    this.f101176a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C43369e eVar) {
                    boolean z;
                    C43478j jVar;
                    int i;
                    List<C43368d> list;
                    String str;
                    C43369e eVar2 = eVar;
                    String str2 = "";
                    C89219l.m154721d(eVar2, str2);
                    CandHelper candHelper = this.f101176a.f101172a;
                    EditText editText = this.f101176a.f101175d;
                    String str3 = this.f101176a.f101174c;
                    String str4 = null;
                    if (editText.hasFocus()) {
                        CandHelper candHelper2 = this.f101176a.f101172a;
                        AddressEditViewModel addressEditViewModel = this.f101176a.f101173b;
                        String str5 = this.f101176a.f101174c;
                        List<C43368d> list2 = eVar2.f101224a;
                        candHelper2.f101162e = eVar2.f101226c;
                        int i2 = 0;
                        if (list2 == null || list2.isEmpty()) {
                            candHelper2.mo73865b(addressEditViewModel, str5);
                        } else {
                            C43348a aVar = candHelper2.f101159b;
                            if (aVar == null) {
                                C89219l.m154710a("mAdapter");
                            }
                            Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.ecommerce.address.dto.CandInputData>");
                            aVar.f101178a = C89206ad.m154682d(list2);
                            C43348a aVar2 = candHelper2.f101159b;
                            if (aVar2 == null) {
                                C89219l.m154710a("mAdapter");
                            }
                            C43371g gVar = eVar2.f101225b;
                            if (gVar == null || (str = gVar.f101229a) == null || str.length() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            aVar2.f101179b = !z;
                            if (aVar2.f101179b && (list = aVar2.f101178a) != null) {
                                C43377m[] mVarArr = new C43377m[1];
                                if (gVar != null) {
                                    str4 = gVar.f101229a;
                                }
                                mVarArr[0] = new C43377m(str4);
                                list.add(0, new C43368d(-2, C89070n.m154524c(mVarArr)));
                            }
                            C43348a aVar3 = candHelper2.f101159b;
                            if (aVar3 == null) {
                                C89219l.m154710a("mAdapter");
                            }
                            aVar3.notifyDataSetChanged();
                            PopupWindow popupWindow = candHelper2.f101158a;
                            if (popupWindow == null) {
                                C89219l.m154710a("mPopupWindow");
                            }
                            if (!popupWindow.isShowing()) {
                                PopupWindow popupWindow2 = candHelper2.f101158a;
                                if (popupWindow2 == null) {
                                    C89219l.m154710a("mPopupWindow");
                                }
                                EditText editText2 = candHelper2.f101164g;
                                if (C89219l.m154714a((Object) str5, (Object) "address")) {
                                    i = CandHelper.f101154h;
                                } else {
                                    i = -10;
                                }
                                if (C89219l.m154714a((Object) str5, (Object) "address")) {
                                    i2 = CandHelper.f101155i;
                                }
                                popupWindow2.showAsDropDown(editText2, i, i2);
                            }
                            int a = candHelper2.mo73862a();
                            if (a > 0 && (jVar = this.f101176a.f101173b.f101255l) != null) {
                                String str6 = this.f101176a.f101174c;
                                jVar.f101405d = SystemClock.elapsedRealtime();
                                jVar.f101406e = a;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.putAll(jVar.f101402a);
                                linkedHashMap.put("page_name", "shipping_address");
                                if (str6 != null) {
                                    str2 = str6;
                                }
                                linkedHashMap.put("drop_down_list_name", str2);
                                linkedHashMap.put("item_num", String.valueOf(a));
                                C45544c.m88082a("tiktokec_drop_down_list_show", linkedHashMap);
                            }
                        }
                    } else {
                        candHelper.mo73865b(null, str3);
                    }
                    return C89391z.f203057a;
                }
            };
            C89219l.m154721d(r1, "");
            addressEditViewModel.mo33687b_(new AddressEditViewModel.C43393g(addressEditViewModel, str, r1));
        }
    }

    /* renamed from: a */
    public final int mo73862a() {
        int i;
        C43348a aVar = this.f101159b;
        if (aVar == null) {
            C89219l.m154710a("mAdapter");
        }
        List<C43368d> list = aVar.f101178a;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        C43348a aVar2 = this.f101159b;
        if (aVar2 == null) {
            C89219l.m154710a("mAdapter");
        }
        if (aVar2.f101179b) {
            return i - 1;
        }
        return i;
    }

    static {
        Covode.recordClassIndex(51560);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        f101154h = C89241a.m154730a(TypedValue.applyDimension(1, -5.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        f101155i = C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper$CustomLinearLayoutMgr */
    public static final class CustomLinearLayoutMgr extends LinearLayoutManager {
        static {
            Covode.recordClassIndex(51561);
        }

        public CustomLinearLayoutMgr(Context context) {
            C89219l.m154721d(context, "");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: a */
        public final void mo4319a(Rect rect, int i, int i2) {
            C89219l.m154721d(rect, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            super.mo4319a(rect, i, View.MeasureSpec.makeMeasureSpec(C89241a.m154730a(TypedValue.applyDimension(1, 260.0f, system.getDisplayMetrics())), Integer.MIN_VALUE));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C43348a m86460a(CandHelper candHelper) {
        C43348a aVar = candHelper.f101159b;
        if (aVar == null) {
            C89219l.m154710a("mAdapter");
        }
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper$b */
    public static final class HandlerC43343b extends Handler {

        /* renamed from: a */
        final /* synthetic */ CandHelper f101167a;

        static {
            Covode.recordClassIndex(51563);
        }

        public final void handleMessage(Message message) {
            C89219l.m154721d(message, "");
            CandHelper candHelper = this.f101167a;
            if (candHelper.f101164g.hasFocus()) {
                message.getCallback().run();
            } else {
                candHelper.mo73865b(null, null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        HandlerC43343b(CandHelper candHelper, Looper looper) {
            super(looper);
            this.f101167a = candHelper;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper$c */
    public static final class C43344c implements AbstractC43354b {

        /* renamed from: a */
        final /* synthetic */ CandHelper f101168a;

        /* renamed from: b */
        final /* synthetic */ AddressEditViewModel f101169b;

        /* renamed from: c */
        final /* synthetic */ String f101170c;

        static {
            Covode.recordClassIndex(51564);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper$c$a */
        static final class C43345a extends AbstractC89220m implements AbstractC89172b<C43367c, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C43344c f101171a;

            static {
                Covode.recordClassIndex(51565);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43345a(C43344c cVar) {
                super(1);
                this.f101171a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C43367c cVar) {
                Address address;
                C43367c cVar2 = cVar;
                C89219l.m154721d(cVar2, "");
                AddressEditViewModel addressEditViewModel = this.f101171a.f101169b;
                C43368d dVar = cVar2.f101219b;
                if (dVar != null) {
                    address = dVar.f101222c;
                } else {
                    address = null;
                }
                addressEditViewModel.mo73963a(address);
                String str = cVar2.f101218a;
                if (!(str == null || str.length() == 0 || !(this.f101171a.f101168a.f101163f instanceof ActivityC0945e))) {
                    new C23144b((Activity) this.f101171a.f101168a.f101163f).mo37635a(cVar2.f101218a).mo37637b();
                }
                return C89391z.f203057a;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x008c  */
        @Override // com.p2082ss.android.ugc.aweme.ecommerce.address.candinput.AbstractC43354b
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo73867a(int r13) {
            /*
            // Method dump skipped, instructions count: 257
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper.C43344c.mo73867a(int):void");
        }

        C43344c(CandHelper candHelper, AddressEditViewModel addressEditViewModel, String str) {
            this.f101168a = candHelper;
            this.f101169b = addressEditViewModel;
            this.f101170c = str;
        }
    }

    public CandHelper(Context context, EditText editText) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(editText, "");
        this.f101163f = context;
        this.f101164g = editText;
    }

    /* renamed from: b */
    public final void mo73865b(AddressEditViewModel addressEditViewModel, String str) {
        C43478j jVar;
        PopupWindow popupWindow = this.f101158a;
        if (popupWindow == null) {
            C89219l.m154710a("mPopupWindow");
        }
        if (!(!popupWindow.isShowing() || addressEditViewModel == null || (jVar = addressEditViewModel.f101255l) == null)) {
            jVar.mo73999b(str);
        }
        PopupWindow popupWindow2 = this.f101158a;
        if (popupWindow2 == null) {
            C89219l.m154710a("mPopupWindow");
        }
        popupWindow2.dismiss();
    }

    /* renamed from: a */
    public final void mo73864a(AddressEditViewModel addressEditViewModel, String str) {
        int i;
        C89219l.m154721d(addressEditViewModel, "");
        RecyclerView recyclerView = new RecyclerView(this.f101163f);
        this.f101165k = recyclerView;
        recyclerView.mo4402a(new C44998a(C0643b.m2378c(this.f101163f, R.color.b6), 0, C13628n.m24520b(this.f101163f, 12.0f), 2));
        RecyclerView recyclerView2 = this.f101165k;
        if (recyclerView2 == null) {
            C89219l.m154710a("mCandListView");
        }
        recyclerView2.setVerticalScrollBarEnabled(false);
        RecyclerView recyclerView3 = this.f101165k;
        if (recyclerView3 == null) {
            C89219l.m154710a("mCandListView");
        }
        if (C89219l.m154714a((Object) str, (Object) "address")) {
            int i2 = C45563h.f106105a;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            i = i2 - C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
        } else {
            i = -2;
        }
        PopupWindow popupWindow = new PopupWindow((View) recyclerView3, i, -2, false);
        this.f101158a = popupWindow;
        popupWindow.setInputMethodMode(1);
        PopupWindow popupWindow2 = this.f101158a;
        if (popupWindow2 == null) {
            C89219l.m154710a("mPopupWindow");
        }
        popupWindow2.setSoftInputMode(16);
        C43348a aVar = new C43348a();
        this.f101159b = aVar;
        C43344c cVar = new C43344c(this, addressEditViewModel, str);
        C89219l.m154721d(cVar, "");
        aVar.f101180c = cVar;
        RecyclerView recyclerView4 = this.f101165k;
        if (recyclerView4 == null) {
            C89219l.m154710a("mCandListView");
        }
        C43348a aVar2 = this.f101159b;
        if (aVar2 == null) {
            C89219l.m154710a("mAdapter");
        }
        recyclerView4.setAdapter(aVar2);
        RecyclerView recyclerView5 = this.f101165k;
        if (recyclerView5 == null) {
            C89219l.m154710a("mCandListView");
        }
        CustomLinearLayoutMgr customLinearLayoutMgr = new CustomLinearLayoutMgr(this.f101163f);
        customLinearLayoutMgr.mo4356b(1);
        recyclerView5.setLayoutManager(customLinearLayoutMgr);
        PopupWindow popupWindow3 = this.f101158a;
        if (popupWindow3 == null) {
            C89219l.m154710a("mPopupWindow");
        }
        popupWindow3.setBackgroundDrawable(this.f101163f.getResources().getDrawable(R.drawable.zc));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r7.equals("address") != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        if (r0.length() != 0) goto L_0x0018;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo73863a(android.widget.EditText r6, java.lang.String r7, com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel r8) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper.mo73863a(android.widget.EditText, java.lang.String, com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel):void");
    }
}
