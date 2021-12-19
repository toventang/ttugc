package com.bytedance.router;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.route.BaseRoute;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

public final class MultiRouteIntent extends RouteIntent {
    private final AbstractC89244h routeIntents$delegate = C89250i.m154773a((AbstractC89171a) MultiRouteIntent$routeIntents$2.INSTANCE);
    private final AbstractC89244h routes$delegate = C89250i.m154773a((AbstractC89171a) MultiRouteIntent$routes$2.INSTANCE);

    static {
        Covode.recordClassIndex(25813);
    }

    public final ArrayList<RouteIntent> getRouteIntents() {
        return (ArrayList) this.routeIntents$delegate.getValue();
    }

    public final ArrayList<BaseRoute> getRoutes() {
        return (ArrayList) this.routes$delegate.getValue();
    }

    public final class Builder {
        final /* synthetic */ MultiRouteIntent this$0;

        static {
            Covode.recordClassIndex(25814);
        }

        public final MultiRouteIntent build() {
            return this.this$0;
        }

        public final Builder withBundleAnimation(Bundle bundle) {
            this.this$0.setAnimationBundle(bundle);
            return this;
        }

        public final Builder withCallback(OpenResultCallback openResultCallback) {
            this.this$0.setCallback(openResultCallback);
            return this;
        }

        public Builder(MultiRouteIntent multiRouteIntent, List<? extends RouteIntent> list) {
            C89219l.m154719c(list, "");
            this.this$0 = multiRouteIntent;
            multiRouteIntent.getRouteIntents().addAll(list);
        }
    }
}
