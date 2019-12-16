/*
 * see https://www.simtech-ag.ch/education/java/jegl/resources/meteo/iface
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jegl.meteo.iface;

public interface IMeteo {

	double getMin();

	double getMax();

	double getMed();

	boolean isWuestenTag();

	boolean isHeisserTag();

	boolean isSommertag();

	boolean isTropennacht();

	boolean isHeiztag();

	boolean isVegetationstag();

	boolean isFrosttag();

	boolean isEistag();

}