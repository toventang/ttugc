package com.p2082ss.android.ugc.aweme.shortvideo;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14202u;
import com.bytedance.creativex.recorder.p940b.p941a.C14201t;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g;
import com.p2082ss.android.ugc.aweme.tools.C78608j;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.p4345g.EnumC84434c;
import java.util.List;
import java.util.NoSuchElementException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.an */
public final class C69836an {

    /* renamed from: a */
    private final AbstractC14177d f156059a;

    /* renamed from: b */
    private final C74172g f156060b;

    /* renamed from: c */
    private final CameraComponentModel f156061c;

    /* renamed from: d */
    private final C74172g.C74180b f156062d;

    static {
        Covode.recordClassIndex(82242);
    }

    public final void onEvent(C14207x xVar) {
        boolean z;
        TimeSpeedModelExtension timeSpeedModelExtension;
        C70650dt d = this.f156061c.mo109891d();
        C74172g.C74180b bVar = this.f156062d;
        if (bVar != null) {
            z = bVar.f166663d.invoke().booleanValue();
        } else {
            z = false;
        }
        C84401c.f188722f.mo123658a("DeleteLastFragmentEventHandlerFactory:onEvent,is segment empty" + d.isEmpty() + ",enableTitan:" + z);
        if (!d.isEmpty()) {
            this.f156060b.mo116658a(AbstractC14202u.C14204b.f34481a);
            if (!d.isEmpty()) {
                timeSpeedModelExtension = (TimeSpeedModelExtension) d.remove(d.size() - 1);
                this.f156060b.mo116649N().mo122472c();
                this.f156061c.mo109887a((long) TimeSpeedModelExtension.calculateRealTime(d));
                this.f156061c.f155642G.f155724a.removeLastArray();
                this.f156061c.f155642G.f155725b.removeLastArray();
                this.f156061c.f155642G.f155726c.removeLastArray();
                this.f156061c.f155642G.f155727d.removeLast();
                this.f156061c.f155642G.f155728e.removeLast();
                this.f156061c.f155642G.f155730g.removeLast();
                this.f156061c.f155642G.f155729f.removeLast();
                if (this.f156061c.f155660p.f155723a != null) {
                    this.f156061c.f155660p.f155723a.removeReactionWindowInfo();
                }
                CameraComponentModel cameraComponentModel = this.f156061c;
                if (cameraComponentModel.f155659o.f155690l.size() > 0) {
                    cameraComponentModel.f155659o.f155690l.remove(cameraComponentModel.f155659o.f155690l.size() - 1);
                }
                this.f156060b.mo116662b(C14201t.m25948a((List<TimeSpeedModelExtension>) d, this.f156061c.mo109896h(), true));
                this.f156059a.mo22782a(new C78608j(4));
                this.f156060b.mo22890b(true);
                this.f156060b.mo116666d(xVar);
                if (z) {
                    this.f156060b.mo116659a(timeSpeedModelExtension);
                }
            } else {
                throw new NoSuchElementException("List is empty.");
            }
        } else {
            try {
                C84401c.f188722f.mo123661c("DeleteLastFragmentEventHandlerFactory:onEvent,deleteLastFrag when segments in business is empty.reason:" + xVar.f34491g + ",recordState:" + xVar.f34485a);
                this.f156060b.mo116666d(xVar);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error_code", xVar.f34485a);
                    jSONObject.put("error_message", xVar.f34491g);
                    jSONObject.put("exception", Log.getStackTraceString(new Throwable("delete last segments")));
                    C84401c.f188721e.mo61817a(EnumC84434c.SERVICE_RECORD_SEGMENTS_DELETE_ILLEGAL, 0, jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            timeSpeedModelExtension = null;
        }
        if (d.isEmpty()) {
            if (this.f156061c.mo109890c()) {
                this.f156059a.mo22782a(new C78608j(3));
            } else if (!this.f156061c.mo109889b()) {
                this.f156060b.mo22887a(this.f156061c.f155664t, false);
            }
            C74172g gVar = this.f156060b;
            if (!gVar.f166629c.f155653i) {
                gVar.f166641o.mo7019b(false);
            }
        }
        this.f156060b.mo116646K().mo114729a();
        if (!z) {
            this.f156060b.mo116659a(timeSpeedModelExtension);
        }
    }

    public C69836an(AbstractC14177d dVar, C74172g gVar, CameraComponentModel cameraComponentModel, C74172g.C74180b bVar) {
        this.f156059a = dVar;
        this.f156060b = gVar;
        this.f156061c = cameraComponentModel;
        this.f156062d = bVar;
    }
}
