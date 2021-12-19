package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ImShareContactListStruct;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PublishImShareSettingItem */
public final class PublishImShareSettingItem extends LinearLayout {
    static {
        Covode.recordClassIndex(86047);
    }

    public PublishImShareSettingItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final ImShareContactListStruct getSelectedContactList() {
        return new ImShareContactListStruct(new ArrayList());
    }

    private /* synthetic */ PublishImShareSettingItem(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PublishImShareSettingItem(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9221);
        MethodCollector.m26664o(9221);
    }
}
