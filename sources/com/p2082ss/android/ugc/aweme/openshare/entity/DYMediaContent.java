package com.p2082ss.android.ugc.aweme.openshare.entity;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.openshare.entity.DYMediaContent */
public class DYMediaContent {
    public AbstractC62726a mMediaObject;

    static {
        Covode.recordClassIndex(73543);
    }

    public DYMediaContent() {
    }

    public final boolean checkArgs() {
        return this.mMediaObject.checkArgs();
    }

    public final int getType() {
        AbstractC62726a aVar = this.mMediaObject;
        if (aVar == null) {
            return 0;
        }
        return aVar.type();
    }

    public DYMediaContent(AbstractC62726a aVar) {
        this.mMediaObject = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.openshare.entity.DYMediaContent$a */
    public static class C62725a {
        static {
            Covode.recordClassIndex(73544);
        }

        /* renamed from: a */
        public static DYMediaContent m113113a(Bundle bundle) {
            DYMediaContent dYMediaContent = new DYMediaContent();
            String string = bundle.getString("_dyobject_identifier_");
            if (string != null && string.length() > 0) {
                try {
                    dYMediaContent.mMediaObject = (AbstractC62726a) Class.forName(string).newInstance();
                    dYMediaContent.mMediaObject.unserialize(bundle);
                    return dYMediaContent;
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            return dYMediaContent;
        }
    }
}
