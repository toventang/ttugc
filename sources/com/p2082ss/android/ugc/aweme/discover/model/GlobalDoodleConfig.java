package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig */
public final class GlobalDoodleConfig implements Serializable {
    @AbstractC27891c(mo46611a = "ab_params")
    private Map<String, String> abParams;
    @AbstractC27891c(mo46611a = "card_gradient_bg")
    private CardGradientBgData cardBgData;
    @AbstractC27891c(mo46611a = "display_filter_bar")
    private int displayFilterBar = 1;
    @AbstractC27891c(mo46611a = "gradient_bg")
    private GradientBgData gradientBgData;
    @AbstractC27891c(mo46611a = "new_source")
    private String newSource;
    @AbstractC27891c(mo46611a = "keyword")
    private String requestKeyword;
    @AbstractC27891c(mo46611a = "search_channel")
    private String searchChannel;
    @AbstractC27891c(mo46611a = "show_results_source")
    private String showResultsSource;
    @AbstractC27891c(mo46611a = "sounds_list_type")
    private int soundsListType;
    @AbstractC27891c(mo46611a = "survey_config")
    private SearchSurveyConfig surveyConfig;
    @AbstractC27891c(mo46611a = "tns_search_result")
    private String tnsBanType;
    @AbstractC27891c(mo46611a = "use_scenario")
    private String useScenario;

    static {
        Covode.recordClassIndex(50453);
    }

    public final Map<String, String> getAbParams() {
        return this.abParams;
    }

    public final CardGradientBgData getCardBgData() {
        return this.cardBgData;
    }

    public final int getDisplayFilterBar() {
        return this.displayFilterBar;
    }

    public final GradientBgData getGradientBgData() {
        return this.gradientBgData;
    }

    public final String getNewSource() {
        return this.newSource;
    }

    public final String getRequestKeyword() {
        return this.requestKeyword;
    }

    public final String getSearchChannel() {
        return this.searchChannel;
    }

    public final String getShowResultsSource() {
        return this.showResultsSource;
    }

    public final int getSoundsListType() {
        return this.soundsListType;
    }

    public final SearchSurveyConfig getSurveyConfig() {
        return this.surveyConfig;
    }

    public final String getTnsBanType() {
        return this.tnsBanType;
    }

    public final String getUseScenario() {
        return this.useScenario;
    }

    public final void setAbParams(Map<String, String> map) {
        this.abParams = map;
    }

    public final void setCardBgData(CardGradientBgData cardGradientBgData) {
        this.cardBgData = cardGradientBgData;
    }

    public final void setDisplayFilterBar(int i) {
        this.displayFilterBar = i;
    }

    public final void setGradientBgData(GradientBgData gradientBgData2) {
        this.gradientBgData = gradientBgData2;
    }

    public final void setNewSource(String str) {
        this.newSource = str;
    }

    public final void setRequestKeyword(String str) {
        this.requestKeyword = str;
    }

    public final void setSearchChannel(String str) {
        this.searchChannel = str;
    }

    public final void setShowResultsSource(String str) {
        this.showResultsSource = str;
    }

    public final void setSoundsListType(int i) {
        this.soundsListType = i;
    }

    public final void setSurveyConfig(SearchSurveyConfig searchSurveyConfig) {
        this.surveyConfig = searchSurveyConfig;
    }

    public final void setTnsBanType(String str) {
        this.tnsBanType = str;
    }

    public final void setUseScenario(String str) {
        this.useScenario = str;
    }
}
