package InheritanceAndRecord;

public sealed class Square extends Shape permits TransparentSquare {

	/*
	 * Sealed classes or interfaces can only be extended or implemented by permitted classes or interfaces
	 * Permits Used to specify which classes or interfaces are allowed to extend or implement
	 * Non-sealed: no restriction on any classes or interfaces for extension
	 * final: class cannot be extended
	 * 
	 * Any class that is sealed muse define permits, any permitted class or interface must either be sealed
	 * and permit, final or non-sealed.
	 * 
	 * Any class not using any of above will behave as usual
	 */
}
