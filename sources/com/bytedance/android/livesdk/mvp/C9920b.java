package com.bytedance.android.livesdk.mvp;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.ReplacementTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.C6886aw;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.chatroom.p488c.C7409y;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.mvp.b */
public final class C9920b extends AbstractC11293v implements WeakHandler.IHandler {

    /* renamed from: k */
    public static final C9921a f24046k = new C9921a((byte) 0);

    /* renamed from: a */
    public boolean f24047a;

    /* renamed from: b */
    public boolean f24048b = true;

    /* renamed from: c */
    public String f24049c = "";

    /* renamed from: d */
    InputFilter f24050d;

    /* renamed from: e */
    public final Handler f24051e = new WeakHandler(this);

    /* renamed from: f */
    public boolean f24052f;

    /* renamed from: g */
    public int f24053g;

    /* renamed from: h */
    public long f24054h;

    /* renamed from: i */
    public EnterRoomConfig f24055i;

    /* renamed from: j */
    final TextWatcher f24056j = new C9932l(this);

    /* renamed from: l */
    private C88411a f24057l = new C88411a();

    /* renamed from: m */
    private HashMap f24058m;

    static {
        Covode.recordClassIndex(11470);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f24058m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f24058m == null) {
            this.f24058m = new HashMap();
        }
        View view = (View) this.f24058m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f24058m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.mvp.b$a */
    public static final class C9921a {
        static {
            Covode.recordClassIndex(11471);
        }

        private C9921a() {
        }

        public /* synthetic */ C9921a(byte b) {
            this();
        }
    }

    /* renamed from: e */
    private static boolean m18241e() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b5b);
        bVar.f27014a = 0;
        bVar.f27015b = R.style.a2c;
        bVar.f27020g = 80;
        bVar.f27022i = -2;
        bVar.f27018e = false;
        return bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.mvp.b$b */
    public static final class C9922b extends ReplacementTransformationMethod {
        static {
            Covode.recordClassIndex(11472);
        }

        /* access modifiers changed from: protected */
        public final char[] getOriginal() {
            return new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        }

        /* access modifiers changed from: protected */
        public final char[] getReplacement() {
            return new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        }
    }

    /* renamed from: com.bytedance.android.livesdk.mvp.b$j */
    static final class RunnableC9930j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9920b f24068a;

        static {
            Covode.recordClassIndex(11480);
        }

        RunnableC9930j(C9920b bVar) {
            this.f24068a = bVar;
        }

        public final void run() {
            if (this.f24068a.mo8166a_(R.id.asq) != null) {
                ((LiveEditText) this.f24068a.mo8166a_(R.id.asq)).requestFocus();
                LiveEditText liveEditText = (LiveEditText) this.f24068a.mo8166a_(R.id.asq);
                C89219l.m154716b(liveEditText, "");
                C11279p.m20003a((EditText) liveEditText);
            }
        }
    }

    /* renamed from: d */
    public final void mo9929d() {
        getContext();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m18241e();
        }
        if (C58029j.f132256h) {
            LiveAutoRtlImageView liveAutoRtlImageView = (LiveAutoRtlImageView) mo8166a_(R.id.awh);
            C89219l.m154716b(liveAutoRtlImageView, "");
            liveAutoRtlImageView.setBackground(C3966y.m9665c(2131234867));
            LiveTextView liveTextView = (LiveTextView) mo8166a_(R.id.title);
            C89219l.m154716b(liveTextView, "");
            liveTextView.setText(C3966y.m9657a((int) R.string.eo0));
            LiveTextView liveTextView2 = (LiveTextView) mo8166a_(R.id.acq);
            C89219l.m154716b(liveTextView2, "");
            liveTextView2.setText(C3966y.m9657a((int) R.string.emn));
            return;
        }
        LiveAutoRtlImageView liveAutoRtlImageView2 = (LiveAutoRtlImageView) mo8166a_(R.id.awh);
        C89219l.m154716b(liveAutoRtlImageView2, "");
        liveAutoRtlImageView2.setBackground(C3966y.m9665c(R.drawable.c_n));
        LiveTextView liveTextView3 = (LiveTextView) mo8166a_(R.id.title);
        C89219l.m154716b(liveTextView3, "");
        liveTextView3.setText(C3966y.m9657a((int) R.string.ee6));
        LiveTextView liveTextView4 = (LiveTextView) mo8166a_(R.id.acq);
        C89219l.m154716b(liveTextView4, "");
        liveTextView4.setText(C3966y.m9657a((int) R.string.ee7) + " " + C3966y.m9657a((int) R.string.emn));
    }

    /* renamed from: com.bytedance.android.livesdk.mvp.b$k */
    static final class View$OnClickListenerC9931k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C9920b f24069a;

        static {
            Covode.recordClassIndex(11481);
        }

        View$OnClickListenerC9931k(C9920b bVar) {
            this.f24069a = bVar;
        }

        public final void onClick(View view) {
            this.f24069a.mo16632a(true);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.mvp.b$l */
    public static final class C9932l implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C9920b f24070a;

        static {
            Covode.recordClassIndex(11482);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9932l(C9920b bVar) {
            this.f24070a = bVar;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            boolean z;
            C89219l.m154721d(editable, "");
            if (this.f24070a.f27009o) {
                C9920b bVar = this.f24070a;
                LiveEditText liveEditText = (LiveEditText) bVar.mo8166a_(R.id.asq);
                C89219l.m154716b(liveEditText, "");
                Editable text = liveEditText.getText();
                if (text == null || (str = text.toString()) == null) {
                    str = "";
                }
                bVar.f24049c = str;
                C9920b bVar2 = this.f24070a;
                bVar2.f24053g = bVar2.f24049c.length();
                LiveButton liveButton = (LiveButton) this.f24070a.mo8166a_(R.id.eak);
                C89219l.m154716b(liveButton, "");
                if (this.f24070a.f24052f || this.f24070a.f24053g < 4) {
                    z = false;
                } else {
                    z = true;
                }
                liveButton.setEnabled(z);
                if (this.f24070a.f24053g > 32) {
                    String str2 = this.f24070a.f24049c;
                    Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                    String substring = str2.substring(0, 32);
                    C89219l.m154716b(substring, "");
                    ((LiveEditText) this.f24070a.mo8166a_(R.id.asq)).setText(substring);
                    this.f24070a.f24053g = 32;
                    ((LiveEditText) this.f24070a.mo8166a_(R.id.asq)).setSelection(32);
                    C9920b bVar3 = this.f24070a;
                    LiveEditText liveEditText2 = (LiveEditText) bVar3.mo8166a_(R.id.asq);
                    C89219l.m154716b(liveEditText2, "");
                    bVar3.f24050d = new InputFilter.LengthFilter(32);
                    liveEditText2.setFilters(new InputFilter[]{bVar3.f24050d});
                    ConstraintLayout constraintLayout = (ConstraintLayout) this.f24070a.mo8166a_(R.id.fi5);
                    C89219l.m154716b(constraintLayout, "");
                    constraintLayout.setVisibility(0);
                } else {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f24070a.mo8166a_(R.id.fi5);
                    C89219l.m154716b(constraintLayout2, "");
                    constraintLayout2.setVisibility(8);
                    C9920b bVar4 = this.f24070a;
                    LiveEditText liveEditText3 = (LiveEditText) bVar4.mo8166a_(R.id.asq);
                    C89219l.m154716b(liveEditText3, "");
                    if (bVar4.f24050d != null) {
                        liveEditText3.setFilters(new InputFilter[0]);
                        bVar4.f24050d = null;
                    }
                }
                if (this.f24070a.f24048b && this.f24070a.f24053g > 0) {
                    this.f24070a.f24048b = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.mvp.b$c */
    public static final class C9923c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C9920b f24059a;

        static {
            Covode.recordClassIndex(11473);
        }

        C9923c(C9920b bVar) {
            this.f24059a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f24059a.f24047a = true;
            ((LiveButton) this.f24059a.mo8166a_(R.id.eak)).mo9139b();
            this.f24059a.dismiss();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (this.f24053g >= 4) {
            LiveButton liveButton = (LiveButton) mo8166a_(R.id.eak);
            C89219l.m154716b(liveButton, "");
            liveButton.setEnabled(true);
        }
        this.f24052f = false;
    }

    /* renamed from: com.bytedance.android.livesdk.mvp.b$i */
    static final class View$OnClickListenerC9929i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C9920b f24067a;

        static {
            Covode.recordClassIndex(11479);
        }

        View$OnClickListenerC9929i(C9920b bVar) {
            this.f24067a = bVar;
        }

        public final void onClick(View view) {
            C9920b bVar = this.f24067a;
            LiveEditText liveEditText = (LiveEditText) bVar.mo8166a_(R.id.asq);
            C89219l.m154716b(liveEditText, "");
            String valueOf = String.valueOf(liveEditText.getText());
            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase();
            C89219l.m154716b(upperCase, "");
            bVar.mo16631a(upperCase);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        long j;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            j = arguments.getLong("roomId");
        } else {
            j = 0;
        }
        this.f24054h = j;
        C11870f fVar = C11870f.C11871a.f28404a;
        C89219l.m154716b(fVar, "");
        EnterRoomLinkSession a = fVar.mo19010a();
        C89219l.m154716b(a, "");
        this.f24055i = a.f28391b;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void onDismiss(DialogInterface dialogInterface) {
        C7409y yVar = new C7409y();
        yVar.f18361a = this.f24047a;
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28315b(C6886aw.class, yVar);
        }
        super.onDismiss(dialogInterface);
        this.f24051e.removeMessages(101);
        this.f24057l.mo142944a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.mvp.b$f */
    public static final class C9926f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C9920b f24062a;

        /* renamed from: b */
        final /* synthetic */ boolean f24063b;

        static {
            Covode.recordClassIndex(11476);
        }

        C9926f(C9920b bVar, boolean z) {
            this.f24062a = bVar;
            this.f24063b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            MethodCollector.m26663i(4852);
            LiveLoadingView liveLoadingView = (LiveLoadingView) this.f24062a.mo8166a_(R.id.cg3);
            C89219l.m154716b(liveLoadingView, "");
            liveLoadingView.setVisibility(8);
            if (!this.f24063b) {
                C9920b bVar = this.f24062a;
                ((ViewStub) bVar.getView().findViewById(R.id.awg)).inflate();
                ((LiveButton) bVar.mo8166a_(R.id.djd)).setOnClickListener(new View$OnClickListenerC9931k(bVar));
            }
            this.f24062a.mo9929d();
            MethodCollector.m26664o(4852);
        }
    }

    /* renamed from: a */
    public final void mo16632a(boolean z) {
        LiveLoadingView liveLoadingView = (LiveLoadingView) mo8166a_(R.id.cg3);
        C89219l.m154716b(liveLoadingView, "");
        liveLoadingView.setVisibility(0);
        this.f24057l.mo142945a(((PaidRoomApi) C5805e.m12718a().mo11572a(PaidRoomApi.class)).queryRoomData(Long.valueOf(this.f24054h)).mo143271a(new C11191f()).mo143254a(new C9925e(this), new C9926f(this, z)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.mvp.b$d */
    public static final class C9924d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C9920b f24060a;

        static {
            Covode.recordClassIndex(11474);
        }

        C9924d(C9920b bVar) {
            this.f24060a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f24060a.mo8166a_(R.id.fi5);
            C89219l.m154716b(constraintLayout, "");
            constraintLayout.setVisibility(0);
            if (th instanceof C2912a) {
                C2912a aVar = (C2912a) th;
                String prompt = aVar.getPrompt();
                if (prompt == null || prompt.length() == 0) {
                    LiveTextView liveTextView = (LiveTextView) this.f24060a.mo8166a_(R.id.awp);
                    C89219l.m154716b(liveTextView, "");
                    liveTextView.setText(C3966y.m9657a((int) R.string.e4_));
                } else {
                    LiveTextView liveTextView2 = (LiveTextView) this.f24060a.mo8166a_(R.id.awp);
                    C89219l.m154716b(liveTextView2, "");
                    liveTextView2.setText(aVar.getPrompt());
                }
                String extra = aVar.getExtra();
                if (!(extra == null || extra.length() == 0)) {
                    Object obj2 = new JSONObject(aVar.getExtra()).get("block_duration");
                    if (!(obj2 instanceof Integer)) {
                        obj2 = null;
                    }
                    Integer num = (Integer) obj2;
                    if (num != null && num.intValue() > 0) {
                        this.f24060a.f24051e.removeMessages(101);
                        Message obtainMessage = this.f24060a.f24051e.obtainMessage(101);
                        C89219l.m154716b(obtainMessage, "");
                        this.f24060a.f24051e.sendMessageDelayed(obtainMessage, (long) (num.intValue() * 1000));
                        this.f24060a.f24052f = true;
                        LiveButton liveButton = (LiveButton) this.f24060a.mo8166a_(R.id.eak);
                        C89219l.m154716b(liveButton, "");
                        liveButton.setEnabled(false);
                    }
                }
            } else {
                LiveTextView liveTextView3 = (LiveTextView) this.f24060a.mo8166a_(R.id.awp);
                C89219l.m154716b(liveTextView3, "");
                liveTextView3.setText(C3966y.m9657a((int) R.string.e4_));
            }
            ((LiveButton) this.f24060a.mo8166a_(R.id.eak)).mo9139b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.mvp.b$h */
    static final class View$OnClickListenerC9928h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C9920b f24065a;

        /* renamed from: b */
        final /* synthetic */ C9919a f24066b;

        static {
            Covode.recordClassIndex(11478);
        }

        View$OnClickListenerC9928h(C9920b bVar, C9919a aVar) {
            this.f24065a = bVar;
            this.f24066b = aVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            EnterRoomConfig.RoomsData roomsData;
            EnterRoomConfig.RoomsData roomsData2;
            EnterRoomConfig.LogData logData;
            EnterRoomConfig.LogData logData2;
            EnterRoomConfig.RoomsData roomsData3;
            EnterRoomConfig.RoomsData roomsData4;
            C6501b a = C6501b.C6502a.m13948a("livesdk_event_gate_popup_click_more");
            EnterRoomConfig enterRoomConfig = this.f24065a.f24055i;
            String str6 = null;
            if (enterRoomConfig == null || (roomsData4 = enterRoomConfig.f28233c) == null) {
                str = null;
            } else {
                str = roomsData4.f28293J;
            }
            C6501b a2 = a.mo12651a("enter_from_merge", str);
            EnterRoomConfig enterRoomConfig2 = this.f24065a.f24055i;
            if (enterRoomConfig2 == null || (roomsData3 = enterRoomConfig2.f28233c) == null) {
                str2 = null;
            } else {
                str2 = roomsData3.f28295L;
            }
            C6501b a3 = a2.mo12651a("enter_method", str2);
            EnterRoomConfig enterRoomConfig3 = this.f24065a.f24055i;
            if (enterRoomConfig3 == null || (logData2 = enterRoomConfig3.f28232b) == null) {
                str3 = null;
            } else {
                str3 = logData2.f28258b;
            }
            C6501b a4 = a3.mo12651a("anchor_id", str3).mo12646a("room_id", this.f24065a.f24054h);
            EnterRoomConfig enterRoomConfig4 = this.f24065a.f24055i;
            if (enterRoomConfig4 == null || (logData = enterRoomConfig4.f28232b) == null) {
                str4 = null;
            } else {
                str4 = logData.f28257a;
            }
            C6501b a5 = a4.mo12651a("request_id", str4);
            EnterRoomConfig enterRoomConfig5 = this.f24065a.f24055i;
            if (enterRoomConfig5 == null || (roomsData2 = enterRoomConfig5.f28233c) == null) {
                str5 = null;
            } else {
                str5 = roomsData2.f28296M;
            }
            C6501b a6 = a5.mo12651a("action_type", str5);
            EnterRoomConfig enterRoomConfig6 = this.f24065a.f24055i;
            if (!(enterRoomConfig6 == null || (roomsData = enterRoomConfig6.f28233c) == null)) {
                str6 = roomsData.f28289F;
            }
            a6.mo12651a("follow_status", str6).mo12655b();
            String str7 = this.f24066b.f24044c;
            if (str7 != null) {
                AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
                Context context = this.f24065a.getContext();
                AbstractC6956d.C6957a b = AbstractC6963e.m14872b(str7);
                b.f17379c = true;
                webViewManager.mo13248a(context, b);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.mvp.b$m */
    static final class View$OnClickListenerC9933m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C9920b f24071a;

        static {
            Covode.recordClassIndex(11483);
        }

        View$OnClickListenerC9933m(C9920b bVar) {
            this.f24071a = bVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            EnterRoomConfig.RoomsData roomsData;
            EnterRoomConfig.LogData logData;
            EnterRoomConfig.RoomsData roomsData2;
            EnterRoomConfig.LogData logData2;
            EnterRoomConfig.RoomsData roomsData3;
            EnterRoomConfig.RoomsData roomsData4;
            C6501b a = C6501b.C6502a.m13948a("livesdk_event_gate_popup_exit");
            EnterRoomConfig enterRoomConfig = this.f24071a.f24055i;
            String str6 = null;
            if (enterRoomConfig == null || (roomsData4 = enterRoomConfig.f28233c) == null) {
                str = null;
            } else {
                str = roomsData4.f28293J;
            }
            C6501b a2 = a.mo12651a("enter_from_merge", str);
            EnterRoomConfig enterRoomConfig2 = this.f24071a.f24055i;
            if (enterRoomConfig2 == null || (roomsData3 = enterRoomConfig2.f28233c) == null) {
                str2 = null;
            } else {
                str2 = roomsData3.f28295L;
            }
            C6501b a3 = a2.mo12651a("enter_method", str2);
            EnterRoomConfig enterRoomConfig3 = this.f24071a.f24055i;
            if (enterRoomConfig3 == null || (logData2 = enterRoomConfig3.f28232b) == null) {
                str3 = null;
            } else {
                str3 = logData2.f28258b;
            }
            C6501b a4 = a3.mo12651a("anchor_id", str3).mo12646a("room_id", this.f24071a.f24054h);
            EnterRoomConfig enterRoomConfig4 = this.f24071a.f24055i;
            if (enterRoomConfig4 == null || (roomsData2 = enterRoomConfig4.f28233c) == null) {
                str4 = null;
            } else {
                str4 = roomsData2.f28296M;
            }
            C6501b a5 = a4.mo12651a("action_type", str4);
            EnterRoomConfig enterRoomConfig5 = this.f24071a.f24055i;
            if (enterRoomConfig5 == null || (logData = enterRoomConfig5.f28232b) == null) {
                str5 = null;
            } else {
                str5 = logData.f28257a;
            }
            C6501b a6 = a5.mo12651a("request_id", str5);
            EnterRoomConfig enterRoomConfig6 = this.f24071a.f24055i;
            if (!(enterRoomConfig6 == null || (roomsData = enterRoomConfig6.f28233c) == null)) {
                str6 = roomsData.f28289F;
            }
            a6.mo12651a("follow_status", str6).mo12655b();
            this.f24071a.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo16631a(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        EnterRoomConfig.LogData logData;
        EnterRoomConfig.LogData logData2;
        EnterRoomConfig.RoomsData roomsData3;
        EnterRoomConfig.RoomsData roomsData4;
        C6501b a = C6501b.C6502a.m13948a("livesdk_event_gate_popup_continue");
        EnterRoomConfig enterRoomConfig = this.f24055i;
        String str7 = null;
        if (enterRoomConfig == null || (roomsData4 = enterRoomConfig.f28233c) == null) {
            str2 = null;
        } else {
            str2 = roomsData4.f28293J;
        }
        C6501b a2 = a.mo12651a("enter_from_merge", str2);
        EnterRoomConfig enterRoomConfig2 = this.f24055i;
        if (enterRoomConfig2 == null || (roomsData3 = enterRoomConfig2.f28233c) == null) {
            str3 = null;
        } else {
            str3 = roomsData3.f28295L;
        }
        C6501b a3 = a2.mo12651a("enter_method", str3);
        EnterRoomConfig enterRoomConfig3 = this.f24055i;
        if (enterRoomConfig3 == null || (logData2 = enterRoomConfig3.f28232b) == null) {
            str4 = null;
        } else {
            str4 = logData2.f28258b;
        }
        C6501b a4 = a3.mo12651a("anchor_id", str4).mo12646a("room_id", this.f24054h);
        EnterRoomConfig enterRoomConfig4 = this.f24055i;
        if (enterRoomConfig4 == null || (logData = enterRoomConfig4.f28232b) == null) {
            str5 = null;
        } else {
            str5 = logData.f28257a;
        }
        C6501b a5 = a4.mo12651a("request_id", str5);
        EnterRoomConfig enterRoomConfig5 = this.f24055i;
        if (enterRoomConfig5 == null || (roomsData2 = enterRoomConfig5.f28233c) == null) {
            str6 = null;
        } else {
            str6 = roomsData2.f28296M;
        }
        C6501b a6 = a5.mo12651a("action_type", str6);
        EnterRoomConfig enterRoomConfig6 = this.f24055i;
        if (!(enterRoomConfig6 == null || (roomsData = enterRoomConfig6.f28233c) == null)) {
            str7 = roomsData.f28289F;
        }
        a6.mo12651a("follow_status", str7).mo12655b();
        LiveButton liveButton = (LiveButton) mo8166a_(R.id.eak);
        if (!liveButton.f11485i) {
            liveButton.f11487k = liveButton.f11486j.getVisibility();
            liveButton.f11488l = liveButton.f11483g.getVisibility();
            if (liveButton.f11486j.getVisibility() == 0) {
                liveButton.f11486j.setVisibility(4);
            }
            if (liveButton.f11483g.getVisibility() == 0) {
                liveButton.f11483g.setVisibility(4);
            }
            liveButton.f11485i = true;
            liveButton.f11484h.start();
        }
        this.f24057l.mo142945a(((PaidRoomApi) C5805e.m12718a().mo11572a(PaidRoomApi.class)).checkCode(str, Long.valueOf(this.f24054h)).mo143271a(new C11191f()).mo143254a(new C9923c(this), new C9924d(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.mvp.b$e */
    public static final class C9925e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C9920b f24061a;

        static {
            Covode.recordClassIndex(11475);
        }

        C9925e(C9920b bVar) {
            this.f24061a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            EnterRoomConfig.RoomsData roomsData;
            EnterRoomConfig.LogData logData;
            EnterRoomConfig.RoomsData roomsData2;
            EnterRoomConfig.LogData logData2;
            EnterRoomConfig.RoomsData roomsData3;
            EnterRoomConfig.RoomsData roomsData4;
            C5832d dVar = (C5832d) obj;
            LiveLoadingView liveLoadingView = (LiveLoadingView) this.f24061a.mo8166a_(R.id.cg3);
            C89219l.m154716b(liveLoadingView, "");
            liveLoadingView.setVisibility(8);
            if (dVar.data != null) {
                C9920b bVar = this.f24061a;
                Object obj2 = dVar.data;
                C89219l.m154716b(obj2, "");
                C9919a aVar = (C9919a) obj2;
                LiveButton liveButton = (LiveButton) bVar.mo8166a_(R.id.eak);
                C89219l.m154716b(liveButton, "");
                liveButton.setEnabled(false);
                C6501b a = C6501b.C6502a.m13948a("livesdk_event_gate_popup_show");
                EnterRoomConfig enterRoomConfig = bVar.f24055i;
                ImageModel imageModel = null;
                if (enterRoomConfig == null || (roomsData4 = enterRoomConfig.f28233c) == null) {
                    str = null;
                } else {
                    str = roomsData4.f28293J;
                }
                C6501b a2 = a.mo12651a("enter_from_merge", str);
                EnterRoomConfig enterRoomConfig2 = bVar.f24055i;
                if (enterRoomConfig2 == null || (roomsData3 = enterRoomConfig2.f28233c) == null) {
                    str2 = null;
                } else {
                    str2 = roomsData3.f28295L;
                }
                C6501b a3 = a2.mo12651a("enter_method", str2);
                EnterRoomConfig enterRoomConfig3 = bVar.f24055i;
                if (enterRoomConfig3 == null || (logData2 = enterRoomConfig3.f28232b) == null) {
                    str3 = null;
                } else {
                    str3 = logData2.f28258b;
                }
                C6501b a4 = a3.mo12651a("anchor_id", str3).mo12646a("room_id", bVar.f24054h);
                EnterRoomConfig enterRoomConfig4 = bVar.f24055i;
                if (enterRoomConfig4 == null || (roomsData2 = enterRoomConfig4.f28233c) == null) {
                    str4 = null;
                } else {
                    str4 = roomsData2.f28296M;
                }
                C6501b a5 = a4.mo12651a("action_type", str4);
                EnterRoomConfig enterRoomConfig5 = bVar.f24055i;
                if (enterRoomConfig5 == null || (logData = enterRoomConfig5.f28232b) == null) {
                    str5 = null;
                } else {
                    str5 = logData.f28257a;
                }
                C6501b a6 = a5.mo12651a("request_id", str5);
                EnterRoomConfig enterRoomConfig6 = bVar.f24055i;
                if (enterRoomConfig6 == null || (roomsData = enterRoomConfig6.f28233c) == null) {
                    str6 = null;
                } else {
                    str6 = roomsData.f28289F;
                }
                a6.mo12651a("follow_status", str6).mo12655b();
                ConstraintLayout constraintLayout = (ConstraintLayout) bVar.mo8166a_(R.id.akz);
                C89219l.m154716b(constraintLayout, "");
                constraintLayout.setVisibility(0);
                ImageView imageView = (ImageView) bVar.mo8166a_(R.id.ox);
                User user = aVar.f24045d;
                if (user != null) {
                    imageModel = user.getAvatarThumb();
                }
                ImageView imageView2 = (ImageView) bVar.mo8166a_(R.id.ox);
                C89219l.m154716b(imageView2, "");
                int width = imageView2.getWidth();
                ImageView imageView3 = (ImageView) bVar.mo8166a_(R.id.ox);
                C89219l.m154716b(imageView3, "");
                C7577g.m15571a(imageView, imageModel, width, imageView3.getHeight(), 2131234742);
                LiveTextView liveTextView = (LiveTextView) bVar.mo8166a_(R.id.ejq);
                C89219l.m154716b(liveTextView, "");
                liveTextView.setText(aVar.f24042a);
                LiveTextView liveTextView2 = (LiveTextView) bVar.mo8166a_(R.id.adu);
                C89219l.m154716b(liveTextView2, "");
                liveTextView2.setText(aVar.f24043b);
                LiveEditText liveEditText = (LiveEditText) bVar.mo8166a_(R.id.asq);
                C89219l.m154716b(liveEditText, "");
                liveEditText.setTransformationMethod(new C9922b());
                ((LinearLayout) bVar.mo8166a_(R.id.akc)).setOnClickListener(new View$OnClickListenerC9928h(bVar, aVar));
                ((LiveButton) bVar.mo8166a_(R.id.eak)).setOnClickListener(new View$OnClickListenerC9929i(bVar));
                LiveEditText liveEditText2 = (LiveEditText) bVar.mo8166a_(R.id.asq);
                liveEditText2.addTextChangedListener(bVar.f24056j);
                liveEditText2.setOnKeyListener(new View$OnKeyListenerC9927g(bVar));
                ((LiveEditText) bVar.mo8166a_(R.id.asq)).postDelayed(new RunnableC9930j(bVar), 100);
                return;
            }
            this.f24061a.mo9929d();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((ImageView) mo8166a_(R.id.a7_)).setOnClickListener(new View$OnClickListenerC9933m(this));
        mo16632a(false);
    }

    /* renamed from: com.bytedance.android.livesdk.mvp.b$g */
    static final class View$OnKeyListenerC9927g implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C9920b f24064a;

        static {
            Covode.recordClassIndex(11477);
        }

        View$OnKeyListenerC9927g(C9920b bVar) {
            this.f24064a = bVar;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (66 != i) {
                return false;
            }
            C89219l.m154716b(keyEvent, "");
            if (1 != keyEvent.getAction()) {
                return false;
            }
            C9920b bVar = this.f24064a;
            LiveEditText liveEditText = (LiveEditText) bVar.mo8166a_(R.id.asq);
            C89219l.m154716b(liveEditText, "");
            String valueOf = String.valueOf(liveEditText.getText());
            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase();
            C89219l.m154716b(upperCase, "");
            bVar.mo16631a(upperCase);
            return true;
        }
    }
}
