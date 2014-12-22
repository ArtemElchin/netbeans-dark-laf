/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2013 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2013 Sun Microsystems, Inc.
 */
package no_name;

import java.awt.Color;
import java.awt.Font;
import java.util.concurrent.Callable;
import javax.swing.JLabel;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

/**
 *
 * @author S. Aubrecht, P. Somol
 */
public class DarkMetalTheme extends MetalTheme {

    private final ColorUIResource primary1 = new ColorUIResource( 0x79797d );
    private final ColorUIResource primary2 = new ColorUIResource( 0x47474b );
    private final ColorUIResource primary3 = new ColorUIResource( 0x636363 );
    private final ColorUIResource secondary1 = new ColorUIResource( 0x717171 );
    private final ColorUIResource secondary2 = new ColorUIResource( 0x5b5b5f );
    private final ColorUIResource secondary3 = new ColorUIResource( 0x333337 );
    private final ColorUIResource black = new ColorUIResource( 0xdedede );
    private final ColorUIResource white = new ColorUIResource( 0x2f4f4f );

    @Override
    public String getName() {
        return "NetBeans Dark Theme";
    }

    @Override
    public void addCustomEntriesToTable( UIDefaults table ) {
        super.addCustomEntriesToTable( table );
        table.put( "nb.dark.theme", Boolean.TRUE );
        table.put( "nb.imageicon.filter", new DarkIconFilter() ); //NOI18N
        table.put( "nb.errorForeground", new Color(0xff4747) ); //NOI18N
        table.put( "nb.warningForeground", new Color(0xffd80) ); //NOI18N
        table.put( "PropSheet.setBackground", new Color( primary2.getRGB() ) ); //NOI18N
        table.put( "PropSheet.selectedSetBackground", new Color( primary1.getRGB() ) ); //NOI18N
        table.put( "PropSheet.selectedSetForeground", black ); //NOI18N
        table.put( "PropSheet.setForeground", black ); //NOI18N
        table.put( "PropSheet.selectionBackground", primary3 ); //NOI18N
        table.put( "PropSheet.selectionForeground", black ); //NOI18N

        table.put( "nb.heapview.border1", secondary1 ); //NOI18N
        table.put( "nb.heapview.border2", secondary2 ); //NOI18N
        table.put( "nb.heapview.border3", white ); //NOI18N

        table.put( "nb.heapview.foreground", black ); //NOI18N

        table.put( "nb.heapview.background1", primary1 ); //NOI18N

        table.put( "nb.heapview.background2", primary2 ); //NOI18N

        table.put( "nb.heapview.grid1.start", new Color( 0x615f57 ) ); //NOI18N
        table.put( "nb.heapview.grid1.end", new Color( 0x626058 ) ); //NOI18N
        table.put( "nb.heapview.grid2.start", new Color( 0x63615a ) ); //NOI18N
        table.put( "nb.heapview.grid2.end", new Color( 0x65635c ) ); //NOI18N
        table.put( "nb.heapview.grid3.start", new Color( 0x66655d ) ); //NOI18N
        table.put( "nb.heapview.grid3.end", new Color( 0x69675f ) ); //NOI18N
        table.put( "nb.heapview.grid4.start", new Color( 0x6b6961 ) ); //NOI18N
        table.put( "nb.heapview.grid4.end", new Color( 0x6d6b63 ) ); //NOI18N

        UIManager.put( "nb.bugtracking.comment.background", new Color(0x47474b) ); //NOI18N
        UIManager.put( "nb.bugtracking.comment.foreground", new Color(0xe6e6e6) ); //NOI18N
        UIManager.put( "nb.bugtracking.label.highlight", new Color(0x47474b) ); //NOI18N
        UIManager.put( "nb.bugtracking.table.background", new Color(0x121e31) ); //NOI18N
        UIManager.put( "nb.bugtracking.table.background.alternate", new Color(0xd1624) ); //NOI18N
        UIManager.put( "nb.bugtracking.new.color", new Color(0x0e00) ); //NOI18N
        UIManager.put( "nb.bugtracking.modified.color", new Color(0x51b6ff) ); //NOI18N
        UIManager.put( "nb.bugtracking.obsolete.color", new Color(0x828282) ); //NOI18N
        UIManager.put( "nb.bugtracking.conflict.color", new Color(0xff3333)); //NOI18N

        UIManager.put( "nb.html.link.foreground", new Color(0xa4a4ff) ); //NOI18N
        UIManager.put( "nb.html.link.foreground.hover", new Color(0xffd80) ); //NOI18N
        UIManager.put( "nb.html.link.foreground.visited", new Color(0x3232ff) ); //NOI18N
        UIManager.put( "nb.html.link.foreground.focus", new Color(0xffd80) ); //NOI18N

        UIManager.put( "nb.startpage.defaultbackground", Boolean.TRUE );
        UIManager.put( "nb.startpage.defaultbuttonborder", Boolean.TRUE );
        UIManager.put( "nb.startpage.bottombar.background", new Color(0x404040) );
        UIManager.put( "nb.startpage.topbar.background", new Color(0x404040) );
        UIManager.put( "nb.startpage.border.color", new Color(0x121e31) );
        UIManager.put( "nb.startpage.tab.border1.color", new Color(0x404040) );
        UIManager.put( "nb.startpage.tab.border2.color", new Color(0x404040) );
        UIManager.put( "nb.startpage.rss.details.color", new Color(0xdedede) );
        UIManager.put( "nb.startpage.rss.header.color", new Color(0xa4a4ff) );
        UIManager.put( "nb.startpage.tab.imagename.selected", "org/netbeans/modules/welcome/resources/tab_selected_dark.png" ); //NOI18N
        UIManager.put( "nb.startpage.tab.imagename.rollover", "org/netbeans/modules/welcome/resources/tab_rollover_dark.png" ); //NOI18N
        UIManager.put( "nb.startpage.imagename.contentheader", "org/netbeans/modules/welcome/resources/content_banner_dark.png" ); //NOI18N
        UIManager.put( "nb.startpage.contentheader.color1", new Color(0xc213d) ); //NOI18N
        UIManager.put( "nb.startpage.contentheader.color2", new Color(0x10182a) ); //NOI18N

        UIManager.put( "nb.editor.errorstripe.caret.color", new Color(0xdedede) ); //NOI18N
        UIManager.put( "nb.wizard.hideimage", Boolean.TRUE ); //NOI18N

        //diff & diff sidebar
        UIManager.put( "nb.diff.added.color", new Color(0x243424) ); //NOI18N
        UIManager.put( "nb.diff.changed.color", new Color(0x202833) ); //NOI18N
        UIManager.put( "nb.diff.deleted.color", new Color(0x332024) ); //NOI18N
        UIManager.put( "nb.diff.applied.color", new Color(0x243424) ); //NOI18N
        UIManager.put( "nb.diff.notapplied.color", new Color(0x202833) ); //NOI18N
        UIManager.put( "nb.diff.unresolved.color", new Color(0x332024) ); //NOI18N

        UIManager.put( "nb.diff.sidebar.changed.color", new Color(0x121e4a) ); //NOI18N
        UIManager.put( "nb.diff.sidebar.deleted.color", new Color(0x421e31) ); //NOI18N

        UIManager.put( "nb.versioning.tooltip.background.color", new Color(0x121e4a) ); //NOI18N

        //form designer
        UIManager.put( "nb.formdesigner.gap.fixed.color", new Color(0x707070) ); //NOI18N
        UIManager.put( "nb.formdesigner.gap.resizing.color", new Color(0x747474) ); //NOI18N
        UIManager.put( "nb.formdesigner.gap.min.color", new Color(0x686868) ); //NOI18N

        UIManager.put( "nbProgressBar.Foreground", black );
        UIManager.put( "nbProgressBar.popupDynaText.foreground", new Color(0xbfbaac) );

        // debugger
        UIManager.put( "nb.debugger.debugging.currentThread", new Color(0x1e501c) ); //NOI18N
        UIManager.put( "nb.debugger.debugging.highlightColor", new Color(0x283c26) ); //NOI18N
        UIManager.put( "nb.debugger.debugging.BPHits", new Color(0x41410)); //NOI18N
        UIManager.put( "nb.debugger.debugging.bars.BPHits", new Color(0x787819)); //NOI18N
        UIManager.put( "nb.debugger.debugging.bars.currentThread", new Color(0x286423)); //NOI18N

        //versioning
        UIManager.put( "nb.versioning.added.color", new Color(0x0e00)); //NOI18N
        UIManager.put( "nb.versioning.modified.color", new Color(0x51b6ff)); //NOI18N
        UIManager.put( "nb.versioning.deleted.color", new Color(0xffc80)); //NOI18N
        UIManager.put( "nb.versioning.conflicted.color", new Color(0xff3333)); //NOI18N
        UIManager.put( "nb.versioning.ignored.color", new Color(0x828282)); //NOI18N
        UIManager.put( "nb.versioning.remotemodification.color", black); //NOI18N

        // db.dataview
        UIManager.put("nb.dataview.table.background", new RelativeColor(new Color(0x000), new Color(0x000), "Table.background")); //NOI18N
        UIManager.put("nb.dataview.table.altbackground", new RelativeColor(new Color(0x000), new Color(0x1e1e1e), "Table.background")); //NOI18N
        UIManager.put("nb.dataview.table.sqlconstant.foreground", new Color(0xdcdcdc)); //NOI18N
        UIManager.put("nb.dataview.tablecell.focused", new RelativeColor(new Color(0x000), new Color(0xaa1e), "Table.selectionBackground")); //NOI18N
        UIManager.put("nb.dataview.table.rollOverRowBackground", new RelativeColor(new Color(0x000), new Color(0x1e1e1e), "Table.selectionBackground")); //NOI18N
        UIManager.put("nb.dataview.tablecell.edited.selected.foreground", new Color(0xfff83c));  //NOI18N
        UIManager.put("nb.dataview.tablecell.edited.unselected.foreground", new Color(0x0ff10));  //NOI18N
        UIManager.put("nb.dataview.jxdatetimepicker.background",  new RelativeColor(new Color(0x000), new Color(0x000), "Table.background")); //NOI18N
        UIManager.put("nb.dataview.jxdatetimepicker.foreground", new RelativeColor(new Color(0x000), new Color(0x000), "Table.foreground")); //NOI18N
        UIManager.put("nb.dataview.jxdatetimepicker.selectedBackground", new RelativeColor(new Color(0x000), new Color(0x000), "Table.selectionBackground")); //NOI18N
        UIManager.put("nb.dataview.jxdatetimepicker.selectedForeground", new RelativeColor(new Color(0x000), new Color(0x000), "Table.selectionForeground")); //NOI18N
        UIManager.put("nb.dataview.jxdatetimepicker.daysOfTheWeekForeground", new RelativeColor(new Color(0x000), new Color(0x000), "Table.background")); //NOI18N
        UIManager.put("nb.dataview.jxdatetimepicker.todayBackground", new RelativeColor(new Color(0x000), new Color(0x141414), "TableHeader.background")); //NOI18N
        UIManager.put("nb.dataview.jxdatetimepicker.todayPanel.background.gradient.start", new RelativeColor(new Color(0x000), new Color(0x000), "TableHeader.background")); //NOI18N
        UIManager.put("nb.dataview.jxdatetimepicker.todayPanel.background.gradient.end", new RelativeColor(new Color(0x000), new Color(0xaaa), "TableHeader.background")); //NOI18N
        UIManager.put("nb.dataview.jxdatetimepicker.todayPanel.linkForeground", new RelativeColor(new Color(0x000), new Color(0x000), "TableHeader.foreground")); //NOI18N
        
        // autoupdate
        UIManager.put("nb.autoupdate.search.highlight", new Color(0xff4b0));
        
        UIManager.put("selection.highlight", new Color(0xca980));
        UIManager.put( "textArea.background", new Color( 0x333337) );

        UIManager.put( "nb.laf.postinstall.callable", new Callable<Object>() { //NOI18N

            @Override
            public Object call() throws Exception {
                //change the default link foreground color
                HTMLEditorKit kit = new HTMLEditorKit();
                StyleSheet newStyleSheet = new StyleSheet();
                Font f = new JLabel().getFont();
                newStyleSheet.addRule(new StringBuffer("body { font-size: ").append(f.getSize()) // NOI18N
                            .append("; font-family: ").append(f.getName()).append("; }").toString()); // NOI18N
                newStyleSheet.addRule( "a { color: #A4A4FF; text-decoration: underline}"); //NOI18N
                newStyleSheet.addStyleSheet(kit.getStyleSheet());
                kit.setStyleSheet(newStyleSheet);
                return null;
            }
        });

        //#232854 - menu item accelerators are too dark
        UIManager.put( "MenuItem.acceleratorForeground", new Color(0xc6c6c6) );
        UIManager.put( "CheckBoxMenuItem.acceleratorForeground", new Color(0xc6c6c6) );
        UIManager.put( "RadioButtonMenuItem.acceleratorForeground", new Color(0xc6c6c6) );

        //browser picker
        UIManager.put( "Nb.browser.picker.background.light", new Color(0x29292d));
        UIManager.put( "Nb.browser.picker.foreground.light", new Color(0xacacac));

        //search in projects
        UIManager.put("nb.search.sandbox.highlight", new Color(0x685d9c));
        UIManager.put("nb.search.sandbox.regexp.wrong", new Color(0xff4747));
    }

    @Override
    protected ColorUIResource getPrimary1() {
        return primary1;
    }

    @Override
    protected ColorUIResource getPrimary2() {
        return primary2;
    }

    @Override
    protected ColorUIResource getPrimary3() {
        return primary3;
    }

    @Override
    protected ColorUIResource getSecondary1() {
        return secondary1;
    }

    @Override
    protected ColorUIResource getSecondary2() {
        return secondary2;
    }

    @Override
    protected ColorUIResource getSecondary3() {
        return secondary3;
    }

    @Override
    protected ColorUIResource getWhite() {
        return white;
    }

    @Override
    protected ColorUIResource getBlack() {
        return black;
    }

    @Override
    public FontUIResource getControlTextFont() {
        return DEFAULT_FONT;
    }

    @Override
    public FontUIResource getSystemTextFont() {
        return DEFAULT_FONT;
    }

    @Override
    public FontUIResource getUserTextFont() {
        return DEFAULT_FONT;
    }

    @Override
    public FontUIResource getMenuTextFont() {
        return DEFAULT_FONT;
    }

    @Override
    public FontUIResource getWindowTitleFont() {
        return DEFAULT_FONT;
    }

    @Override
    public FontUIResource getSubTextFont() {
        return DEFAULT_FONT;
    }

    private final static FontUIResource DEFAULT_FONT = new FontUIResource("Dialog", Font.PLAIN, 11); //NOI18N
}
