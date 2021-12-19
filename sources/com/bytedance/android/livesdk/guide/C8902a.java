package com.bytedance.android.livesdk.guide;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.C11300w;
import com.bytedance.android.livesdk.C6889az;
import com.bytedance.android.livesdk.livesetting.gift.LiveGuideDialogDurationSetting;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.android.livesdk.service.p625c.p627b.C10723a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.widget.C11424f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.guide.a */
public final class C8902a extends Fragment {

    /* renamed from: a */
    long f21947a;

    /* renamed from: b */
    C9698b f21948b;

    /* renamed from: c */
    public DataChannel f21949c;

    /* renamed from: d */
    public AbstractC8903a f21950d;

    /* renamed from: e */
    private View f21951e;

    /* renamed from: f */
    private View f21952f;

    /* renamed from: g */
    private ImageView f21953g;

    /* renamed from: h */
    private LiveTextView f21954h;

    /* renamed from: i */
    private LiveTextView f21955i;

    /* renamed from: j */
    private final C88411a f21956j = new C88411a();

    /* renamed from: k */
    private HashMap f21957k;

    /* renamed from: com.bytedance.android.livesdk.guide.a$a */
    public interface AbstractC8903a {
        static {
            Covode.recordClassIndex(9788);
        }

        /* renamed from: a */
        void mo15164a();
    }

    /* renamed from: com.bytedance.android.livesdk.guide.a$d */
    static final class View$OnClickListenerC8906d implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC8906d f21960a = new View$OnClickListenerC8906d();

        static {
            Covode.recordClassIndex(9791);
        }

        View$OnClickListenerC8906d() {
        }

        public final void onClick(View view) {
        }
    }

    static {
        Covode.recordClassIndex(9787);
    }

    /* renamed from: a */
    private View m17254a(int i) {
        if (this.f21957k == null) {
            this.f21957k = new HashMap();
        }
        View view = (View) this.f21957k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f21957k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f21957k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f21956j.mo142944a();
    }

    /* renamed from: com.bytedance.android.livesdk.guide.a$b */
    static final class C8904b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8902a f21958a;

        static {
            Covode.recordClassIndex(9789);
        }

        C8904b(C8902a aVar) {
            this.f21958a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C10723a.m19302b(C10723a.EnumC10724a.TIME_UP);
            AbstractC8903a aVar = this.f21958a.f21950d;
            if (aVar != null) {
                aVar.mo15164a();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.guide.a$c */
    static final class View$OnClickListenerC8905c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8902a f21959a;

        static {
            Covode.recordClassIndex(9790);
        }

        View$OnClickListenerC8905c(C8902a aVar) {
            this.f21959a = aVar;
        }

        public final void onClick(View view) {
            C10723a.m19302b(C10723a.EnumC10724a.USER_CLOSE);
            AbstractC8903a aVar = this.f21959a.f21950d;
            if (aVar != null) {
                aVar.mo15164a();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.guide.a$e */
    static final class View$OnClickListenerC8907e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8902a f21961a;

        static {
            Covode.recordClassIndex(9792);
        }

        View$OnClickListenerC8907e(C8902a aVar) {
            this.f21961a = aVar;
        }

        public final void onClick(View view) {
            C10723a.m19302b(C10723a.EnumC10724a.USER_CLOSE);
            AbstractC8903a aVar = this.f21961a.f21950d;
            if (aVar != null) {
                aVar.mo15164a();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.guide.a$f */
    static final class View$OnClickListenerC8908f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8902a f21962a;

        static {
            Covode.recordClassIndex(9793);
        }

        View$OnClickListenerC8908f(C8902a aVar) {
            this.f21962a = aVar;
        }

        public final void onClick(View view) {
            Room room;
            boolean z;
            C8902a aVar = this.f21962a;
            C6501b.C6502a.m13948a("gift_guide_popup_send_click").mo12646a("gift_id", aVar.f21947a).mo12639a().mo12655b();
            C9904t findGiftById = GiftManager.inst().findGiftById(aVar.f21947a);
            if (findGiftById != null) {
                DataChannel dataChannel = aVar.f21949c;
                User user = null;
                if (dataChannel != null) {
                    room = (Room) dataChannel.mo28318b(C9093de.class);
                } else {
                    room = null;
                }
                GiftDialogViewModel.EnumC10039a aVar2 = GiftDialogViewModel.EnumC10039a.GIFT;
                long j = aVar.f21947a;
                boolean z2 = false;
                if (findGiftById.f24000e == 1 || findGiftById.f24000e == 5 || findGiftById.f24000e == 10) {
                    z = false;
                } else {
                    z = true;
                }
                C10700d dVar = new C10700d(aVar2, j, z);
                if (findGiftById.f24000e != 1) {
                    z2 = true;
                }
                dVar.f25769k = z2;
                dVar.f25773o = "click";
                dVar.f25775q = findGiftById.f23993J;
                dVar.f25764f = findGiftById.f24001f;
                dVar.f25774p = "0";
                if (room != null) {
                    user = room.getOwner();
                }
                dVar.f25767i = user;
                dVar.f25768j = "gift_guide_popup";
                DataChannel dataChannel2 = aVar.f21949c;
                if (dataChannel2 != null) {
                    dataChannel2.mo28320c(C6889az.class, dVar);
                }
                AbstractC8903a aVar3 = aVar.f21950d;
                if (aVar3 != null) {
                    aVar3.mo15164a();
                }
            }
            C10723a.m19302b(C10723a.EnumC10724a.SEND);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ImageModel imageModel;
        String str;
        Resources resources;
        Drawable drawable;
        AbstractC2994b a;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.am6).setOnClickListener(new View$OnClickListenerC8905c(this));
        view.findViewById(R.id.fip).setOnClickListener(View$OnClickListenerC8906d.f21960a);
        View findViewById = view.findViewById(R.id.agf);
        this.f21951e = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC8907e(this));
        }
        this.f21952f = view.findViewById(R.id.dvc);
        ((LinearLayout) m17254a(R.id.dvd)).setOnClickListener(new View$OnClickListenerC8908f(this));
        this.f21953g = (ImageView) view.findViewById(R.id.ba4);
        this.f21954h = (LiveTextView) view.findViewById(R.id.fai);
        this.f21955i = (LiveTextView) view.findViewById(R.id.ajw);
        C9904t findGiftById = GiftManager.inst().findGiftById(this.f21947a);
        ImageView imageView = this.f21953g;
        C11424f fVar = null;
        if (findGiftById != null) {
            imageModel = findGiftById.f23997b;
        } else {
            imageModel = null;
        }
        C3951p.m9630b(imageView, imageModel);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b == null || (a = b.mo13147a()) == null || (str = a.getDisplayId()) == null) {
            str = "";
        }
        String a2 = C3966y.m9660a((int) R.string.e2e, str);
        LiveTextView liveTextView = this.f21954h;
        if (liveTextView != null) {
            liveTextView.setText(a2);
        }
        CharSequence a3 = C11300w.m20049a(this.f21948b);
        LiveTextView liveTextView2 = this.f21955i;
        if (liveTextView2 != null) {
            liveTextView2.setText(a3.toString());
        }
        this.f21956j.mo142945a(AbstractC88979t.m154307b((long) LiveGuideDialogDurationSetting.INSTANCE.getValue(), TimeUnit.SECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C8904b(this)));
        if (findGiftById != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Context context = getContext();
            if (!(context == null || (resources = context.getResources()) == null || (drawable = resources.getDrawable(2131234659)) == null)) {
                drawable.setBounds(0, 0, C3966y.m9653a(11.0f), C3966y.m9653a(11.0f));
                fVar = new C11424f(drawable);
            }
            if (C3966y.m9672g()) {
                spannableStringBuilder.append((CharSequence) "(");
                spannableStringBuilder.append((CharSequence) String.valueOf(findGiftById.f24001f));
                spannableStringBuilder.append((CharSequence) ".");
                spannableStringBuilder.append((CharSequence) ")");
            } else {
                spannableStringBuilder.append((CharSequence) "(");
                spannableStringBuilder.append((CharSequence) ".");
                spannableStringBuilder.append((CharSequence) String.valueOf(findGiftById.f24001f));
                spannableStringBuilder.append((CharSequence) ")");
            }
            int a4 = C89361p.m154888a((CharSequence) spannableStringBuilder, ".", 0, false, 6);
            spannableStringBuilder.setSpan(fVar, a4, a4 + 1, 33);
            LiveTextView liveTextView3 = (LiveTextView) m17254a(R.id.dve);
            C89219l.m154716b(liveTextView3, "");
            liveTextView3.setText(spannableStringBuilder);
        }
        C6501b.C6502a.m13948a("gift_guide_popup_show").mo12639a().mo12646a("gift_id", this.f21947a).mo12655b();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b5q, viewGroup, false);
    }
}
