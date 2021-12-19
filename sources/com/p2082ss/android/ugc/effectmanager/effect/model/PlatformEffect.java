package com.p2082ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.PlatformEffect */
public class PlatformEffect {
    String file_uri;
    String hint;
    String hint_uri;
    String icon_uri;
    String name;
    List<String> requirements;
    List<String> types;

    static {
        Covode.recordClassIndex(95591);
    }

    public Effect toEffect(List<String> list) {
        Effect effect = new Effect();
        effect.setName(this.name);
        effect.setHint(this.hint);
        effect.setFileUrl(concatPrefixWithUri(list, this.file_uri));
        effect.setTypes(this.types);
        effect.setHintIcon(concatPrefixWithUri(list, this.hint_uri));
        effect.setIconUrl(concatPrefixWithUri(list, this.icon_uri));
        effect.setRequirements(this.requirements);
        effect.setId(this.file_uri);
        return effect;
    }

    /* access modifiers changed from: package-private */
    public UrlModel concatPrefixWithUri(List<String> list, String str) {
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(str);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(list.get(i) + str);
        }
        urlModel.setUrlList(arrayList);
        return urlModel;
    }
}
