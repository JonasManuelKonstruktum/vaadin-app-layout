package com.github.appreciated.app.layout.behaviour.left;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.dependency.JavaScript;

/**
 * Created by appreciated on 01.05.2017.
 * Edited By deyaeddin on 07.02.2018
 */

@JavaScript("vaadin://addons/app-layout/babel-helpers.js")
@JavaScript("vaadin://addons/app-layout/app-layout-es5-listener.js")
@JavaScript("frontend://bower_components/webcomponentsjs/webcomponents-lite.js")

@HtmlImport("frontend://bower_components/polymer/polymer.html")
@HtmlImport("frontend://bower_components/iron-icons/iron-icons.html")
@HtmlImport("frontend://bower_components/paper-icon-button/paper-icon-button.html")
@HtmlImport("frontend://bower_components/app-layout/app-drawer-layout/app-drawer-layout.html")
@HtmlImport("frontend://bower_components/app-layout/app-drawer/app-drawer.html")
@HtmlImport("frontend://bower_components/app-layout/app-scroll-effects/app-scroll-effects.html")
@HtmlImport("frontend://bower_components/app-layout/app-header/app-header.html")
@HtmlImport("frontend://bower_components/app-layout/app-header-layout/app-header-layout.html")
@HtmlImport("frontend://bower_components/app-layout/app-toolbar/app-toolbar.html")

@Tag("left-responsive-hybrid-overlay-no-app-bar")
@HtmlImport("/com/github/appreciated/app/layout/behaviour/left/left-responsive-hybrid-overlay-no-app-bar.html")
public class LeftResponsiveHybridOverlayNoAppBarBase extends AbstractLeftAppLayoutBase {

    @Override
    public Component[] getContent() {
        return null;
    }

    @Override
    public HasComponents getContentHolder() {
        return null;
    }

    @Override
    public HasComponents getMenuElementsHolder() {
        return null;
    }

    @Override
    public HasComponents getAppBarElementsHolder() {
        return null;
    }

    @Override
    public String getStyleName() {
        return "left-responsive-hybrid-overlay-no-app-bar";
    }
}