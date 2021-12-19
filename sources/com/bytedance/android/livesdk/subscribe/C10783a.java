package com.bytedance.android.livesdk.subscribe;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.subscribe.a */
public final class C10783a extends C10935a {

    /* renamed from: a */
    public static final C10784a f25974a = new C10784a((byte) 0);

    /* renamed from: b */
    private String f25975b = "";

    /* renamed from: c */
    private HashMap f25976c;

    static {
        Covode.recordClassIndex(12384);
    }

    /* renamed from: com.bytedance.android.livesdk.subscribe.a$a */
    public static final class C10784a {
        static {
            Covode.recordClassIndex(12385);
        }

        private C10784a() {
        }

        public /* synthetic */ C10784a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f25976c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("enter_from");
            if (string == null) {
                C89219l.m154715b();
            }
            this.f25975b = string;
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C29844g gVar = new C29844g(LiveSubscribeLynxUrl.INSTANCE.getValue().getUser_subscribe_list());
        gVar.mo52130a("show_entrance", this.f25975b);
        Uri parse = Uri.parse(gVar.mo52126a());
        C89219l.m154716b(parse, "");
        ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(getContext(), parse);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b93, viewGroup, false);
    }
}
