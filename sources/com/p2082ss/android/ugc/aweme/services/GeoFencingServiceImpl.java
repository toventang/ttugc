package com.p2082ss.android.ugc.aweme.services;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.geofencing.GeoFencingSettingItem;
import com.p2082ss.android.ugc.aweme.geofencing.p3046b.C52880a;
import com.p2082ss.android.ugc.aweme.services.external.IGeofencingService;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.GeoFencingServiceImpl */
public final class GeoFencingServiceImpl implements IGeofencingService {
    public static final GeoFencingServiceImpl INSTANCE = new GeoFencingServiceImpl();

    private GeoFencingServiceImpl() {
    }

    static {
        Covode.recordClassIndex(79612);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IGeofencingService
    public final void injectGeoFencingSettingItem(Aweme aweme, FrameLayout frameLayout, AbstractC1204m mVar) {
        MethodCollector.m26663i(7101);
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(mVar, "");
        List<String> geofencingRegions = aweme.getGeofencingRegions();
        if (geofencingRegions == null || geofencingRegions.isEmpty()) {
            frameLayout.setVisibility(8);
            MethodCollector.m26664o(7101);
            return;
        }
        frameLayout.setVisibility(0);
        View a = C1764a.m5927a(LayoutInflater.from(frameLayout.getContext()), R.layout.afg, frameLayout, false);
        if (a != null) {
            GeoFencingSettingItem geoFencingSettingItem = (GeoFencingSettingItem) a;
            frameLayout.addView(geoFencingSettingItem);
            C89219l.m154721d(mVar, "");
            if (!GeoFencingSettingItem.m97717a()) {
                geoFencingSettingItem.f121595a.observe(mVar, new GeoFencingSettingItem.C52859b(geoFencingSettingItem));
                C52880a.m97733a(new GeoFencingSettingItem.C52860c(geoFencingSettingItem, geofencingRegions));
            }
            geoFencingSettingItem.setReadOnly(true);
            MethodCollector.m26664o(7101);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.geofencing.GeoFencingSettingItem");
        MethodCollector.m26664o(7101);
        throw nullPointerException;
    }
}
