package com.bytedance.android.livesdk.p604qa;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.C2997d;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p378m.C5763d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.chatroom.p488c.AbstractC7394l;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.event.C8451d;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommunityGuidelineSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCheckQuestionTooShortSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.p448al.C6774a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9014ah;
import com.bytedance.android.livesdk.p561j.C9052br;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.bytedance.android.livesdk.qa.c */
public final class C10241c extends AbstractC11293v {

    /* renamed from: a */
    public final int f24773a = 50;

    /* renamed from: b */
    public boolean f24774b = true;

    /* renamed from: c */
    public String f24775c = "";

    /* renamed from: d */
    InputFilter f24776d;

    /* renamed from: e */
    public Dialog f24777e;

    /* renamed from: f */
    AbstractC89171a<C89391z> f24778f;

    /* renamed from: g */
    private final double f24779g = 0.4d;

    /* renamed from: h */
    private Room f24780h;

    /* renamed from: i */
    private final C88411a f24781i = new C88411a();

    /* renamed from: j */
    private C10257d f24782j;

    /* renamed from: k */
    private final TextWatcher f24783k = new C10246e(this);

    /* renamed from: l */
    private HashMap f24784l;

    static {
        Covode.recordClassIndex(11807);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f24784l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f24784l == null) {
            this.f24784l = new HashMap();
        }
        View view = (View) this.f24784l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f24784l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f24777e;
        if (dialog != null) {
            dialog.dismiss();
        }
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.qa.c$f */
    static final class RunnableC10247f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10241c f24790a;

        static {
            Covode.recordClassIndex(11813);
        }

        RunnableC10247f(C10241c cVar) {
            this.f24790a = cVar;
        }

        public final void run() {
            LiveEditText liveEditText = (LiveEditText) this.f24790a.mo8166a_(R.id.dct);
            if (liveEditText != null) {
                liveEditText.requestFocus();
            }
            LiveEditText liveEditText2 = (LiveEditText) this.f24790a.mo8166a_(R.id.dct);
            if (liveEditText2 != null) {
                C11279p.m20003a((EditText) liveEditText2);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.c$d */
    static final class RunnableC10245d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10241c f24788a;

        static {
            Covode.recordClassIndex(11811);
        }

        RunnableC10245d(C10241c cVar) {
            this.f24788a = cVar;
        }

        public final void run() {
            if (this.f24788a.mo8166a_(R.id.dct) != null) {
                ((LiveEditText) this.f24788a.mo8166a_(R.id.dct)).requestFocus();
                LiveEditText liveEditText = (LiveEditText) this.f24788a.mo8166a_(R.id.dct);
                C89219l.m154716b(liveEditText, "");
                C11279p.m20003a((EditText) liveEditText);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b58);
        bVar.f27014a = 0;
        bVar.f27015b = R.style.a2c;
        bVar.f27020g = 80;
        double b = (double) C3966y.m9662b();
        double d = this.f24779g;
        Double.isNaN(b);
        bVar.f27022i = (int) (b * d);
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo9929d() {
        Editable text;
        String obj;
        String replace;
        LiveEditText liveEditText = (LiveEditText) mo8166a_(R.id.dct);
        if (liveEditText == null || (text = liveEditText.getText()) == null || (obj = text.toString()) == null || (replace = new C89350l("\t|\r|\n").replace(obj, " ")) == null) {
            return "";
        }
        return replace;
    }

    /* renamed from: com.bytedance.android.livesdk.qa.c$n */
    static final class RunnableC10255n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10241c f24804a;

        /* renamed from: b */
        final /* synthetic */ String f24805b;

        /* renamed from: c */
        final /* synthetic */ String f24806c;

        static {
            Covode.recordClassIndex(11821);
        }

        RunnableC10255n(C10241c cVar, String str, String str2) {
            this.f24804a = cVar;
            this.f24805b = str;
            this.f24806c = str2;
        }

        public final void run() {
            this.f24804a.mo17044a(true);
            DataChannel dataChannel = this.f24804a.f27010p;
            String str = this.f24805b;
            String str2 = this.f24806c;
            C6501b a = C6501b.C6502a.m13948a("livesdk_qa_rethink_post_ck").mo12643a(dataChannel);
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            a.mo12646a("user_id", b.mo13161c()).mo12651a(UGCMonitor.EVENT_COMMENT, str2).mo12645a("resend_same_cmt", TextUtils.equals(str, str2) ? 1 : 0).mo12645a("if_click_cg", C10226av.f24753a ? 1 : 0).mo12655b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.c$o */
    static final class RunnableC10256o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10241c f24807a;

        /* renamed from: b */
        final /* synthetic */ String f24808b;

        /* renamed from: c */
        final /* synthetic */ String f24809c;

        static {
            Covode.recordClassIndex(11822);
        }

        RunnableC10256o(C10241c cVar, String str, String str2) {
            this.f24807a = cVar;
            this.f24808b = str;
            this.f24809c = str2;
        }

        public final void run() {
            DataChannel dataChannel = this.f24807a.f27010p;
            String str = this.f24808b;
            String str2 = this.f24809c;
            C6501b a = C6501b.C6502a.m13948a("livesdk_qa_rethink_edit_ck").mo12643a(dataChannel);
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            a.mo12646a("user_id", b.mo13161c()).mo12651a(UGCMonitor.EVENT_COMMENT, str2).mo12645a("resend_same_cmt", TextUtils.equals(str, str2) ? 1 : 0).mo12645a("if_click_cg", C10226av.f24753a ? 1 : 0).mo12655b();
            C10226av.f24754b = SystemClock.uptimeMillis();
            C10226av.f24755c = str2;
        }
    }

    /* renamed from: e */
    public final Map<String, String> mo17045e() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C10257d dVar = this.f24782j;
        if (dVar != null) {
            if (C10175aa.m18673a(this.f27010p)) {
                linkedHashMap.put("ask_enter_from", dVar.f24813d);
            } else {
                linkedHashMap.put("show_question_cnt", String.valueOf(dVar.f24811b + dVar.f24810a));
                linkedHashMap.put("show_answered_question_cnt", String.valueOf(dVar.f24811b));
                linkedHashMap.put("show_not_answered_question_cnt", String.valueOf(dVar.f24810a));
                if (dVar.f24812c) {
                    str = "1";
                } else {
                    str = "0";
                }
                linkedHashMap.put("is_qa_list_end", str);
                linkedHashMap.put("ask_enter_from", "qa_list");
                linkedHashMap.put("qa_list_enter_from", dVar.f24813d);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: com.bytedance.android.livesdk.qa.c$m */
    static final class RunnableC10254m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10241c f24799a;

        /* renamed from: b */
        final /* synthetic */ String f24800b;

        /* renamed from: c */
        final /* synthetic */ Context f24801c;

        /* renamed from: d */
        final /* synthetic */ String f24802d;

        /* renamed from: e */
        final /* synthetic */ String f24803e;

        static {
            Covode.recordClassIndex(11820);
        }

        RunnableC10254m(C10241c cVar, String str, Context context, String str2, String str3) {
            this.f24799a = cVar;
            this.f24800b = str;
            this.f24801c = context;
            this.f24802d = str2;
            this.f24803e = str3;
        }

        public final void run() {
            Object obj;
            AbstractC6956d.C6958b a = AbstractC6963e.m14871a(this.f24800b);
            a.f17407k = -1;
            a.f17406j = 80;
            DataChannel dataChannel = this.f24799a.f27010p;
            if (dataChannel != null) {
                obj = dataChannel.mo28318b(C9076co.class);
            } else {
                obj = null;
            }
            if (C89219l.m154714a(obj, (Object) true)) {
                a.f17399c = (int) C3966y.m9668e((int) (((float) C3966y.m9662b()) * 0.9f));
                a.f17398b = (int) C3966y.m9668e(C3966y.m9664c());
                a.f17420x = C3966y.m9657a((int) R.string.e28);
                a.f17421y = true;
                a.f17389C = true;
            } else {
                AbstractC6956d.C6958b a2 = a.mo13259a(8, 0, 0, 8);
                a2.f17410n = true;
                a2.f17399c = (int) C3966y.m9668e(C3966y.m9662b());
                a2.f17398b = 395;
            }
            C4031a.m9839a(C11279p.m20001a(this.f24801c), ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager().mo13245a(a));
            DataChannel dataChannel2 = this.f24799a.f27010p;
            String str = this.f24802d;
            String str2 = this.f24803e;
            C10226av.f24753a = true;
            C6501b a3 = C6501b.C6502a.m13948a("livesdk_qa_rethink_cg_ck").mo12643a(dataChannel2);
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            a3.mo12646a("user_id", b.mo13161c()).mo12651a(UGCMonitor.EVENT_COMMENT, str2).mo12645a("resend_same_cmt", TextUtils.equals(str, str2) ? 1 : 0).mo12655b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.c$a */
    static final class View$OnClickListenerC10242a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10241c f24785a;

        static {
            Covode.recordClassIndex(11808);
        }

        View$OnClickListenerC10242a(C10241c cVar) {
            this.f24785a = cVar;
        }

        public final void onClick(View view) {
            this.f24785a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.c$b */
    static final class View$OnClickListenerC10243b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10241c f24786a;

        static {
            Covode.recordClassIndex(11809);
        }

        View$OnClickListenerC10243b(C10241c cVar) {
            this.f24786a = cVar;
        }

        public final void onClick(View view) {
            this.f24786a.mo17044a(false);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.c$e */
    public static final class C10246e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C10241c f24789a;

        static {
            Covode.recordClassIndex(11812);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10246e(C10241c cVar) {
            this.f24789a = cVar;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            boolean z;
            C89219l.m154721d(editable, "");
            if (this.f24789a.f27009o) {
                C10241c cVar = this.f24789a;
                LiveEditText liveEditText = (LiveEditText) cVar.mo8166a_(R.id.dct);
                C89219l.m154716b(liveEditText, "");
                Editable text = liveEditText.getText();
                if (text == null || (str = text.toString()) == null) {
                    str = "";
                }
                cVar.f24775c = str;
                LiveButton liveButton = (LiveButton) this.f24789a.mo8166a_(R.id.dcu);
                C89219l.m154716b(liveButton, "");
                if (new C89350l("\\s").replace(this.f24789a.f24775c, "").length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                liveButton.setEnabled(z);
                int length = this.f24789a.f24775c.length();
                if (length > this.f24789a.f24773a) {
                    C6501b.C6502a.m13948a("livesdk_qa_trigger_word_limit").mo12639a().mo12655b();
                    String str2 = this.f24789a.f24775c;
                    int i = this.f24789a.f24773a;
                    Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                    String substring = str2.substring(0, i);
                    C89219l.m154716b(substring, "");
                    ((LiveEditText) this.f24789a.mo8166a_(R.id.dct)).setText(substring);
                    length = this.f24789a.f24773a;
                    ((LiveEditText) this.f24789a.mo8166a_(R.id.dct)).setSelection(this.f24789a.f24773a);
                    C10241c cVar2 = this.f24789a;
                    LiveEditText liveEditText2 = (LiveEditText) cVar2.mo8166a_(R.id.dct);
                    C89219l.m154716b(liveEditText2, "");
                    cVar2.f24776d = new InputFilter.LengthFilter(this.f24789a.f24773a);
                    liveEditText2.setFilters(new InputFilter[]{cVar2.f24776d});
                    ConstraintLayout constraintLayout = (ConstraintLayout) this.f24789a.mo8166a_(R.id.fi3);
                    C89219l.m154716b(constraintLayout, "");
                    constraintLayout.setVisibility(0);
                } else {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f24789a.mo8166a_(R.id.fi3);
                    C89219l.m154716b(constraintLayout2, "");
                    constraintLayout2.setVisibility(4);
                    C10241c cVar3 = this.f24789a;
                    LiveEditText liveEditText3 = (LiveEditText) cVar3.mo8166a_(R.id.dct);
                    C89219l.m154716b(liveEditText3, "");
                    if (cVar3.f24776d != null) {
                        liveEditText3.setFilters(new InputFilter[0]);
                        cVar3.f24776d = null;
                    }
                }
                if (this.f24789a.f24774b && length > 0) {
                    C6501b.C6502a.m13948a("livesdk_qa_begin_to_type").mo12639a().mo12656c("click").mo12655b();
                    this.f24789a.f24774b = false;
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.c$j */
    static final class C10251j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10241c f24796a;

        static {
            Covode.recordClassIndex(11817);
        }

        C10251j(C10241c cVar) {
            this.f24796a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (!((C10258e) obj).f24814a) {
                this.f24796a.dismiss();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.c$i */
    static final class C10250i extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10241c f24795a;

        static {
            Covode.recordClassIndex(11816);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10250i(C10241c cVar) {
            super(1);
            this.f24795a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            Dialog dialog = this.f24795a.f24777e;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.f24795a.dismiss();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.f24781i.mo142944a();
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28315b(C5763d.class, (Object) false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.qa.c$k */
    public static final class C10252k implements LiveDialog.AbstractC4057b {

        /* renamed from: a */
        final /* synthetic */ C10241c f24797a;

        static {
            Covode.recordClassIndex(11818);
        }

        C10252k(C10241c cVar) {
            this.f24797a = cVar;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
        /* renamed from: a */
        public final void mo8359a(DialogInterface dialogInterface) {
            C89219l.m154721d(dialogInterface, "");
            C10241c cVar = this.f24797a;
            C6501b.C6502a.m13948a("livesdk_qa_deny_popup_click").mo12643a(cVar.f27010p).mo12651a("choose_type", "cancel").mo12652a(cVar.mo17045e()).mo12655b();
            dialogInterface.dismiss();
            ((LiveEditText) cVar.mo8166a_(R.id.dct)).postDelayed(new RunnableC10247f(cVar), 200);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C10257d dVar;
        super.onCreate(bundle);
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28309a((AbstractC1204m) this, C9052br.class, (AbstractC89172b) new C10250i(this));
        }
        DataChannel dataChannel2 = this.f27010p;
        if (dataChannel2 != null) {
            dVar = (C10257d) dataChannel2.mo28318b(C10240b.class);
        } else {
            dVar = null;
        }
        this.f24782j = dVar;
        this.f24781i.mo142945a(C6779a.m14563a().mo13052a(C10258e.class).mo143289d(new C10251j(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.qa.c$g */
    public static final class C10248g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10241c f24791a;

        /* renamed from: b */
        final /* synthetic */ String f24792b;

        static {
            Covode.recordClassIndex(11814);
        }

        C10248g(C10241c cVar, String str) {
            this.f24791a = cVar;
            this.f24792b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            DataChannel dataChannel = this.f24791a.f27010p;
            if (dataChannel != null) {
                dataChannel.mo28319c(C10176ab.class);
            }
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.elp);
            this.f24791a.dismiss();
            DataChannel dataChannel2 = this.f24791a.f27010p;
            if (dataChannel2 != null) {
                dataChannel2.mo28311a(C10260g.class, this.f24792b);
            }
            C6501b.C6502a.m13948a("livesdk_qa_ask_publish_success").mo12643a(this.f24791a.f27010p).mo12652a(this.f24791a.mo17045e()).mo12655b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.qa.c$l */
    public static final class C10253l implements LiveDialog.AbstractC4057b {

        /* renamed from: a */
        final /* synthetic */ C10241c f24798a;

        static {
            Covode.recordClassIndex(11819);
        }

        C10253l(C10241c cVar) {
            this.f24798a = cVar;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
        /* renamed from: a */
        public final void mo8359a(DialogInterface dialogInterface) {
            C89219l.m154721d(dialogInterface, "");
            C10241c cVar = this.f24798a;
            C6501b.C6502a.m13948a("livesdk_qa_deny_popup_click").mo12643a(cVar.f27010p).mo12651a("choose_type", "to_comment").mo12652a(cVar.mo17045e()).mo12655b();
            DataChannel dataChannel = cVar.f27010p;
            if (dataChannel != null) {
                C8451d dVar = new C8451d(cVar.mo9929d());
                dVar.f20895b = AbstractC7394l.EnumC7395a.QA;
                dataChannel.mo28320c(C9014ah.class, dVar);
            }
            dialogInterface.dismiss();
            cVar.dismiss();
            AbstractC89171a<C89391z> aVar = cVar.f24778f;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.qa.c$h */
    public static final class C10249h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10241c f24793a;

        /* renamed from: b */
        final /* synthetic */ String f24794b;

        static {
            Covode.recordClassIndex(11815);
        }

        C10249h(C10241c cVar, String str) {
            this.f24793a = cVar;
            this.f24794b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Object obj2;
            Throwable th = (Throwable) obj;
            if (th instanceof C2912a) {
                C2912a aVar = (C2912a) th;
                if (aVar.getErrorCode() == 4021011) {
                    C10241c cVar = this.f24793a;
                    String str2 = this.f24794b;
                    Context context = cVar.getContext();
                    if (context != null) {
                        C89219l.m154716b(context, "");
                        DataChannel dataChannel = cVar.f27010p;
                        RunnableC10254m mVar = null;
                        if (dataChannel != null) {
                            str = (String) dataChannel.mo28318b(C10260g.class);
                        } else {
                            str = null;
                        }
                        DataChannel dataChannel2 = cVar.f27010p;
                        C10226av.f24753a = false;
                        C6501b a = C6501b.C6502a.m13948a("livesdk_qa_rethink_sw").mo12643a(dataChannel2);
                        AbstractC6872f b = C11115u.m19743a().mo17915b();
                        C89219l.m154716b(b, "");
                        a.mo12646a("user_id", b.mo13161c()).mo12651a(UGCMonitor.EVENT_COMMENT, str2).mo12645a("resend_same_cmt", TextUtils.equals(str, str2) ? 1 : 0).mo12655b();
                        Dialog dialog = cVar.f24777e;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        String value = LiveCommunityGuidelineSetting.INSTANCE.getValue();
                        DataChannel dataChannel3 = cVar.f27010p;
                        if (dataChannel3 != null) {
                            obj2 = dataChannel3.mo28318b(C9119ed.class);
                        } else {
                            obj2 = null;
                        }
                        if (C89219l.m154714a(obj2, (Object) false) && !TextUtils.isEmpty(value)) {
                            mVar = new RunnableC10254m(cVar, value, context, str, str2);
                        }
                        cVar.f24777e = C6774a.m14562a(context, mVar, new RunnableC10255n(cVar, str, str2), new RunnableC10256o(cVar, str, str2));
                        Dialog dialog2 = cVar.f24777e;
                        if (dialog2 != null) {
                            dialog2.show();
                        }
                    }
                } else {
                    String prompt = aVar.getPrompt();
                    if (prompt == null || prompt.length() == 0) {
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.elr);
                    } else {
                        String prompt2 = aVar.getPrompt();
                        C89219l.m154716b(prompt2, "");
                        C11279p.m20010a(prompt2);
                    }
                }
            }
            DataChannel dataChannel4 = this.f24793a.f27010p;
            if (dataChannel4 != null) {
                dataChannel4.mo28311a(C10260g.class, this.f24794b);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17044a(boolean r12) {
        /*
        // Method dump skipped, instructions count: 475
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p604qa.C10241c.mo17044a(boolean):void");
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (this.f24782j != null) {
            C6501b.C6502a.m13948a("livesdk_qa_ask_click").mo12643a(this.f27010p).mo12652a(mo17045e()).mo12655b();
        }
        ((ImageView) mo8166a_(R.id.ld)).setOnClickListener(new View$OnClickListenerC10242a(this));
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        AbstractC2994b a = b.mo13147a();
        C89219l.m154716b(a, "");
        ConstraintLayout constraintLayout = (ConstraintLayout) mo8166a_(R.id.fi3);
        C89219l.m154716b(constraintLayout, "");
        constraintLayout.setVisibility(4);
        LiveButton liveButton = (LiveButton) mo8166a_(R.id.dcu);
        C89219l.m154716b(liveButton, "");
        liveButton.setEnabled(false);
        LiveTextView liveTextView = (LiveTextView) mo8166a_(R.id.csh);
        C89219l.m154716b(liveTextView, "");
        liveTextView.setText(C6581g.m14075a(C2997d.C2998a.m8305a()));
        ImageModel avatarThumb = a.getAvatarThumb();
        ImageView imageView = (ImageView) mo8166a_(R.id.mb);
        C89219l.m154716b(imageView, "");
        int width = imageView.getWidth();
        ImageView imageView2 = (ImageView) mo8166a_(R.id.mb);
        C89219l.m154716b(imageView2, "");
        C7577g.m15571a((ImageView) mo8166a_(R.id.mb), avatarThumb, width, imageView2.getHeight(), 2131234742);
        if (LiveCheckQuestionTooShortSetting.INSTANCE.enable()) {
            ((LiveEditText) mo8166a_(R.id.dct)).setHint(R.string.ehf);
        } else {
            ((LiveEditText) mo8166a_(R.id.dct)).setHint(R.string.dv2);
        }
        ((LiveEditText) mo8166a_(R.id.dct)).addTextChangedListener(this.f24783k);
        ((LiveButton) mo8166a_(R.id.dcu)).setOnClickListener(new View$OnClickListenerC10243b(this));
        ((LiveEditText) mo8166a_(R.id.dct)).setOnKeyListener(new View$OnKeyListenerC10244c(this));
        ((LiveEditText) mo8166a_(R.id.dct)).postDelayed(new RunnableC10245d(this), 200);
    }

    /* renamed from: com.bytedance.android.livesdk.qa.c$c */
    static final class View$OnKeyListenerC10244c implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C10241c f24787a;

        static {
            Covode.recordClassIndex(11810);
        }

        View$OnKeyListenerC10244c(C10241c cVar) {
            this.f24787a = cVar;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (66 != i) {
                return false;
            }
            C89219l.m154716b(keyEvent, "");
            if (1 == keyEvent.getAction()) {
                this.f24787a.mo17044a(false);
            }
            return true;
        }
    }
}
