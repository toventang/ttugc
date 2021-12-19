package com.p2082ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.ComposerNode */
public class ComposerNode {
    public String UI_name;
    public List<ComposerNode> children;
    public float default_value;
    public Effect effect;
    public String file;
    public String icon;
    public float max_value;
    public float min_value;
    public ComposerNode parent;
    public int switch_mode;
    public String tag_name;
    public int type;

    static {
        Covode.recordClassIndex(95574);
    }

    public boolean isLeaf() {
        int i = this.type;
        if (i == 4 || i == 1) {
            return false;
        }
        return true;
    }
}
