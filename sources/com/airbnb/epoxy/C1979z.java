package com.airbnb.epoxy;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.epoxy.z */
public final class C1979z extends RuntimeException {
    static {
        Covode.recordClassIndex(2172);
    }

    C1979z(AbstractC1956s sVar, int i) {
        this(sVar, "", i);
    }

    C1979z(AbstractC1956s sVar, String str, int i) {
        super(str + " Position: " + i + " Model: " + sVar.toString() + "\n\nEpoxy attribute fields on a model cannot be changed once the model is added to a controller. Check that these fields are not updated, or that the assigned objects are not mutated, outside of the buildModels method. The only exception is if the change is made inside an Interceptor callback. Consider using an interceptor if you need to change a model after it is added to the controller and before it is set on the adapter. If the model is already set on the adapter then you must call `requestModelBuild` instead to recreate all models.");
    }
}
