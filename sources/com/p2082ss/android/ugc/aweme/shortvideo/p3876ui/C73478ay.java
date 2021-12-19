package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.geofencing.C52864a;
import com.p2082ss.android.ugc.aweme.geofencing.GeoFencingSettingItem;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AddToPlaylistItemStatus;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71908b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.viewmodel.VideoPublishViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ay */
public final class C73478ay extends C73474ax {

    /* renamed from: d */
    public static final C73479a f165092d = new C73479a((byte) 0);

    /* renamed from: e */
    private GeoFencingSettingItem f165093e;

    /* renamed from: f */
    private RelativeLayout f165094f;

    /* renamed from: g */
    private HashMap f165095g;

    static {
        Covode.recordClassIndex(86215);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73474ax
    /* renamed from: a */
    public final void mo116075a() {
        HashMap hashMap = this.f165095g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73474ax, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo116075a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ay$a */
    public static final class C73479a {
        static {
            Covode.recordClassIndex(86216);
        }

        private C73479a() {
        }

        public /* synthetic */ C73479a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73474ax
    /* renamed from: a */
    public final void mo116076a(View view) {
        boolean z;
        C89219l.m154721d(view, "");
        super.mo116076a(view);
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("key_added_to_playlist", false);
        } else {
            z = false;
        }
        JediViewModel a = C20531t.m38716a(requireActivity()).mo33800a(VideoPublishViewModel.class);
        C89219l.m154716b(a, "");
        VideoPublishViewModel videoPublishViewModel = (VideoPublishViewModel) a;
        C52864a b = videoPublishViewModel.mo116263b();
        AddToPlaylistItemStatus a2 = videoPublishViewModel.mo116261a();
        GeoFencingSettingItem geoFencingSettingItem = (GeoFencingSettingItem) view.findViewById(R.id.b__);
        this.f165093e = geoFencingSettingItem;
        if (geoFencingSettingItem == null) {
            C89219l.m154715b();
        }
        b.mo88538a(this, geoFencingSettingItem);
        if (C71908b.m126983a() && z) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.daf);
            this.f165094f = relativeLayout;
            if (relativeLayout == null) {
                C89219l.m154715b();
            }
            a2.bindView(relativeLayout, this);
            RelativeLayout relativeLayout2 = this.f165094f;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(0);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73474ax, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.ags, viewGroup, false);
        C89219l.m154716b(a, "");
        mo116076a(a);
        return a;
    }
}
